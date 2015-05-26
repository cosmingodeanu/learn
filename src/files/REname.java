package files;

import java.io.File;
import java.io.IOException;

public class REname {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File delDir = new File("deldir");
		delDir.mkdir();// make a directory

		File f1 = new File(delDir, "delfile1.txt");
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		File f2 = new File(delDir, "delfile2.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		f1.delete();
		System.out.println("del dir is " + delDir.delete());// attempt to delete
															// the directory
															// having one file
															// in it
		File newFile = new File(delDir, "newnqme.txt");//a new object
		f2.renameTo(newFile);	//rename file
		
		File newDir = new File("newDir");
		
		delDir.renameTo(newDir);

	}

}
