package _8PropertyFiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("./dbConfig.properties");
		if(!f.exists()) {
			f.createNewFile();
		}
		
		System.out.println(f.exists());
		
		Properties prop = new Properties();
		
		prop.setProperty("url","www.google.com");
		prop.setProperty("userName","Striker");
		prop.setProperty("password","1234");
		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos,"Driver setup");
		
	}

}
