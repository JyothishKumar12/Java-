package _6Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class _5FileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("./writing.txt");
		file.createNewFile();
		
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(45);
		fos.write(12);
		fos.write(24);
		fos.write(15);
		fos.write(3);
		fos.write(5);
		
		fos.flush();
	}

}
