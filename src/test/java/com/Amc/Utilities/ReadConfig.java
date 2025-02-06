package com.Amc.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;

	public ReadConfig() {
		File src = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e)
		{
			System.out.println("The Exception is" + e.getMessage());
		}
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
	
	public String getFireforxpath() {
		String firefoxpath = pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	
	public String getIepath() {
		String iepath = pro.getProperty("iepath");
		return iepath;
	}
	
	public String getEdgepath() {
		String edgepath = pro.getProperty("edgepath");
		return edgepath;
	}
}
