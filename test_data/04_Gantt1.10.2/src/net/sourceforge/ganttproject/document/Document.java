/*
 * Created on 18.08.2003
 *
 */
package net.sourceforge.ganttproject.document;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * This interface abstracts the details of file access.
 * 
 * Implementations of this interface provide methods to open streams
 * to a project file, indepent of storage location (filesystem / WebDAV).
 *   
 * @author Michael Haeusler (michael at akatose.de)
 */
public interface Document {

	/**
	 * Gets the description of the document
	 * (can be displayed in the application's titlebar).
	 * @return the description of the document
	 */
	public String getDescription();
	
	/**
	 * Checks, wether the document is readable.
	 * @return readability  
	 */
	public boolean canRead();
	
	/**
	 * Checks, wether the document is writable.
	 * @return writability
	 */
	public boolean canWrite();
	
	/**
	 * Checks, wether the document should appear in the MRU
	 * (list of <b>m</b>ost <b>r</b>ecently <b>u</b>sed files).
	 * @return validity for MRU
	 */
	public boolean isValidForMRU();
	
	/**
	 * Tries to acquire a lock.
	 * <br>
	 * This method is optional. Storage containers, for which
	 * locking is inappropriate, should always return true.
	 *  
	 * @return wether a lock could be successfully acquired
	 * @see #releaseLock()
	 */
	public boolean acquireLock();
	
	/**
	 * Releases a previously acquired lock.
	 * @see #acquireLock()
	 */
	public void releaseLock();
		
	/**
	 * Gets an InputStream, that allows to read from the document.
	 * @return InputStream to read from
	 */
	public InputStream getInputStream() throws IOException;
	
	/**
	 * Gets an OutputStream, that allows to write to the document. 
	 * @return OutputStream to write to
	 */
	public OutputStream getOutputStream() throws IOException;

	/**
	 * Gets the path to the document.
	 *  
	 * @return 	the path to the document
	 */
	public String getPath();
	
	/**
	 * Gets the path to the document,
	 * if it is a file on a local file system
	 * (can be used to initialize a JFileChooser).
	 *  
	 * @return 	the path, if the document is a local file;
	 * 			<code>null</code>, otherwise.
	 */
	public String getFilePath();	

	/**
	 * Gets the path to the document,
	 * if it is a file on a server
	 * (can be used to initialize an UrlChooser).
	 *  
	 * @return 	the path, if the document is a server file;
	 * 			<code>null</code>, otherwise.
	 */
	public String getURLPath();

	/**
	 * Gets the username used to authenticate to the storage container
	 *  
	 * @return 	username
	 */
	public String getUsername();

	/**
	 * Gets the password used to authenticate to the storage container
	 *  
	 * @return 	username
	 */
	public String getPassword();
	
	/**
	 * Sets the credentials used to authenticate to the storage container
	 * @param user username
	 * @param pass password
	 */
	public void setUserInfo(String user, String pass);

	/**
	 * Gets the last error
	 *  
	 * @return 	errormessage
	 */
	public String getLastError();
}
