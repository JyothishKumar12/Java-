package _6Files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _3FileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./sample.txt");
		FileReader fr = new FileReader(file);
		int ascii;
		while((ascii=fr.read())!=-1) {
			System.out.print((char)ascii);
		}
	}

}
