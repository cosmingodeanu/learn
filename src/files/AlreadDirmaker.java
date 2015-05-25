package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AlreadDirmaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File existingDir = new File("existingDir");
		System.out.println(existingDir.isDirectory());
		// assign a dirFile Navigation and I/O (Exam Objective 3.2)
		File existingDirFile = new File(
		existingDir, "existingDirFile.txt");
		System.out.println (existingDirFile.isFile());
		// assign a file
		FileReader fr;
		try {
			fr = new FileReader(existingDirFile);
			BufferedReader br = new BufferedReader(fr);
			// make a Reader
			String s;
			while( (s = br.readLine()) != null)
			System.out.println(s);
			// read data
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
