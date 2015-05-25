package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("fileWrite3.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// create a File object
		// create a FileWriter
		// that will send its
		// output to a File
		PrintWriter pw = new PrintWriter(fw); // create a PrintWriter that will
												// send its
												// output to a Writer
		pw.println("howdy");
		pw.println("folks");
		pw.flush();// won't actually write without
		pw.close();// these 2
		File file1 = new File("fileWrite2.txt"); // create a File object AND
		// open "fileWrite2.txt"
		FileReader fr = null;
		try {
			// create a FileReader to get
			// data from 'file'
			fr = new FileReader(file1);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		// create a BufferReader to
		// get its data from
		try {
			String data = br.readLine();
			while (data != null) {
				System.out.println(data);
				data = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
