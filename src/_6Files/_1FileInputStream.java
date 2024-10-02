package _6Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class _1FileInputStream {

	public static void main(String[] args) throws IOException {
		
		File file = new File("./sample.txt");
		file.createNewFile();
		
//		Read Text file
		
		FileInputStream fInputStream = new FileInputStream(file);
	int asciiCode;
		while((asciiCode=fInputStream.read())!=-1) {
		System.out.print((char)asciiCode);
		}
		
		fInputStream.close();
	}

}
