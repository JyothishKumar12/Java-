package _8PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadProperty {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("dbConfig.properties");
		Properties props = new Properties();
		props.load(fis);
		Set<Object> keys= props.keySet();
		System.out.println(keys);
		
	}

}
