package _6Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _4BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("./sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		br.readLine();
		int ascii;
		while((ascii=br.read())!=-1) {

			System.out.print((char)ascii);
	}

}
}