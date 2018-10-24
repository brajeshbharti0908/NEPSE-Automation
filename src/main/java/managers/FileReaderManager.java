package managers;

import dataProvider.ConfigFileReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;

	/*
	 * Constructor Name: FileReaderManager
	 * 
	 */

	private FileReaderManager() {
	}

	/*
	 * 
	 * Method Name:getInstance Return Type: FileReaderMananger This method is used
	 * to return instance of class FileReaderManager
	 * 
	 * 
	 */
	public static FileReaderManager getInstance() {

		return fileReaderManager;
	}
	/*
	 * Method Name: getConfigFileReader Return Type: ConfigFileReader It creates new
	 * object of class ConfigFileReader if the object is null. If the object is not
	 * null then it returns the existing object
	 */

	public ConfigFileReader getConfigFileReader() {

		return (configFileReader == null) ? configFileReader = new ConfigFileReader() : configFileReader;
	}

}
