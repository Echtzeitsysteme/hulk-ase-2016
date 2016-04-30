package org.apache.webdav.lib;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpURL;

public class WebdavResource {

	public static final String NOACTION = null;

	public WebdavResource(HttpURL httpURL, String noaction2, int i) {
		// TODO Auto-generated constructor stub
	}

	public WebdavResource(HttpURL parentURL) {
		// TODO Auto-generated constructor stub
	}

	public void setFollowRedirects(boolean b) throws HttpException, IOException{
		// TODO Auto-generated method stub
		
	}

	public boolean isCollection() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setProperties(int i) throws HttpException, IOException {
		// TODO Auto-generated method stub
		
	}

	public boolean lockMethod(String string, int lockSeconds)  throws HttpException, IOException {
		// TODO Auto-generated method stub
		return false;
	}

	public void unlockMethod() throws HttpException, IOException  {
		// TODO Auto-generated method stub
		
	}

	public InputStream getMethodData() throws HttpException, IOException  {
		// TODO Auto-generated method stub
		return null;
	}

	public void putMethod(byte[] byteArray)  throws HttpException{
		// TODO Auto-generated method stub
		
	}

}
