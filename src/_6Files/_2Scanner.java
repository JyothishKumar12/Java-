package _6Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _2Scanner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("./sample.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}
