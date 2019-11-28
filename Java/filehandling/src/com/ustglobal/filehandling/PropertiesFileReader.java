package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {
	public static void main(String[] args) {
		
		String path = "db.properties";
		FileReader reader = null;
		try {
			reader = new FileReader(path);
			
//			int i;
//			while((i=reader.read())!=-1) {
//				System.out.print((char)i);
//			}
			
			Properties pro = new Properties();
			pro.load(reader);
			
			String url = pro.getProperty("url");
			String user = pro.getProperty("user");
			String password = pro.getProperty("password");
			
			System.out.println("Url : "+url);
			System.out.println("User : "+user);
			System.out.println("Password : "+password);
			

//			int i;
//			while((i=reader.read())!=-1) {
//				System.out.print((char)i);
//			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
