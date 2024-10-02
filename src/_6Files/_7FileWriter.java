package _6Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _7FileWriter {
 
public static void main(String[] args) throws IOException {
	
	File fi = new File("./fWriter.txt");
	fi.createNewFile();
	String s = "Yoooo spidey";
	FileWriter fw = new FileWriter(fi);
	fw.write(s);
	fw.flush();
	fw.close();
}
}
