package com.amazon.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fin = new FileInputStream(src);
			pro = new Properties();
			pro.load(fin);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL() {
		String url = pro.getProperty("baseUrl");
		return url;
	}

	public String getUserId() {
		String uId = pro.getProperty("userId");
		return uId;
	}

	public String getPassword() {
		String pswd = pro.getProperty("password");
		return pswd;
	}

}
