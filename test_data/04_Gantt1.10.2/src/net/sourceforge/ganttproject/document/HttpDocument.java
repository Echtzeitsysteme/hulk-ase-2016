/*
 * Created on 18.08.2003
 *
 */
package net.sourceforge.ganttproject.document;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.AccessControlException;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpURL;
import org.apache.commons.httpclient.URIException;
import org.apache.webdav.lib.WebdavResource;

/**
 * This class implements the interface Document for file access
 * on HTTP-servers and WebDAV-enabled-servers.
 * 
 * @author Michael Haeusler (michael at akatose.de)
 */
public class HttpDocument extends AbstractURLDocument {

	private String url;
	private String lastError;
	private HttpURL httpURL;
	private WebdavResource webdavResource;
	private boolean locked = false;
	private boolean malformedURL = false;
	
	private static int lockDAVMinutes = 240;
	
	public HttpDocument (String url, String user, String pass) {
		this.url = url;
		try {
			httpURL = new HttpURL (url);		
			if (user == null || user.length() == 0)
				user = httpURL.getUser();
			if (pass == null || pass.length() == 0)
				pass = httpURL.getPassword();
			if (user != null)
				httpURL.setUserinfo(user, pass);
		} catch (URIException e) {
			lastError = e.getMessage();
			malformedURL = true;
		}
	}
	
	private WebdavResource getWebdavResource() {
		if (null == webdavResource)
			try {
				webdavResource = new WebdavResource(httpURL, WebdavResource.NOACTION, 0);
				webdavResource.setFollowRedirects(true);
			} catch (HttpException e) {
				lastError = e.getMessage() + "(" + e.getReasonCode() + ")";
			} catch (IOException e) {
				lastError = e.getMessage();
			}
		return webdavResource;
	}
	
	public String getDescription() {
		String description = httpURL.toString();
		return (description != null) ? description : url;
	}

	public boolean canRead() {
		WebdavResource res = getWebdavResource();
		return (null == res) ? false : (res.exists() && ! res.isCollection());
	}

	public boolean canWrite() {
		WebdavResource res = getWebdavResource();
		if (null == res)
			return false;

		try {
			res.setProperties(0);
		} catch (HttpException e) {
			if (404 != e.getReasonCode())
				return false;
		} catch (IOException e) {
			return false;
		}

		if (res.exists()) {
			return (! res.isCollection());
		} else {
			try {
				HttpURL parentURL = new HttpURL(httpURL.toString());
				String user = httpURL.getUser();
				String pass = httpURL.getPassword();
				if (user != null)
					parentURL.setUserinfo(user, pass);
				String currentHierPath = httpURL.getCurrentHierPath();
				if (! currentHierPath.endsWith("/"))
					currentHierPath = currentHierPath + "/";
				parentURL.setPath(currentHierPath);
				WebdavResource parentRes = new WebdavResource(parentURL);
				if (! parentRes.isCollection()) return false;
				return true;
			} catch (Exception e) {
				return false;
			}
		}
	}

	public boolean isValidForMRU() {
		return (! malformedURL);
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.ganttproject.document.Document#acquireLock(java.lang.String)
	 */
	public boolean acquireLock() {
		if (locked) return true;
		if (null == getWebdavResource()) return false;
		try {
			String userName = " (GanttProject)";
			try {
				userName = " (" + System.getProperty("user.name") + "@GanttProject)";
			} catch (AccessControlException e) {
				// This can happen when running in a sandbox (Java WebStart)
				System.err.println (e + ": " + e.getMessage());
			}
			int lockSeconds = (lockDAVMinutes > 0) ? lockDAVMinutes * 60 : 15;
			locked = getWebdavResource().lockMethod(httpURL.getUser() + userName, lockSeconds);
			return locked;
		} catch (HttpException e) {
			System.err.println(e.getMessage() + e.getReasonCode());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see net.sourceforge.ganttproject.document.Document#releaseLock()
	 */
	public void releaseLock() {
		if (null == getWebdavResource()) return;
		try {
			locked = false;
			getWebdavResource().unlockMethod();
		} catch (HttpException e) {
			System.err.println(e.getMessage() + e.getReasonCode());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public InputStream getInputStream() throws IOException {
		if (null == getWebdavResource())
			throw new IOException(lastError);
		try {
			return getWebdavResource().getMethodData();
		} catch (HttpException e) {
			throw new IOException(e.getMessage()
						  + "(" + e.getReasonCode() + ")");
		}
	}

	public OutputStream getOutputStream() throws IOException {
		if (null == getWebdavResource())
			throw new IOException(lastError);
		return new HttpDocumentOutputStream(getWebdavResource());
	}

	public String getPath() {
		return getDescription();
	}
	
	public String getURLPath() {
		return getPath();
	}

	public String getUsername() {
		try {
			return httpURL.getUser();
		} catch (URIException e) {
			return null;
		}
	}

	public String getPassword() {
		try {
			return httpURL.getPassword();
		} catch (URIException e) {
			return null;
		}
	}

	public void setUserInfo(String user, String pass) {
		try {
			httpURL.setUserinfo(user, pass);
			webdavResource = null;
		} catch (URIException e) {
			lastError = e.getMessage();
			malformedURL = true;
		}
	}

	public String getLastError() {
		return lastError;
	}

	public static void setLockDAVMinutes(int i) {
		lockDAVMinutes = i;
	}
}
