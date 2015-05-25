package files;

import java.io.*;

class Writers {
	public static void main(String[] args) {
		char[] in = new char[50];
		// to store input
		int size = 0;
		try {
			File file = new File(
			// just an object
					"fileWrite2.txt");
			FileWriter fw = new FileWriter(file); // create an actual file
			// & a FileWriter obj
			fw.write("howdy\nfolks\n");
			// write characters to
			// the file
			fw.flush();
			// flush before closing
			fw.close();
			// close file when done448
			FileReader fr = new FileReader(file);
			size = fr.read(in);
			System.out.print(size + " ");
			for (char c : in)
				System.out.print(c);
			fr.close();
		} catch (IOException e) {
		}
		// create a FileReader
		// object
		// read the whole file!
		// how many bytes read
		// print the array
		// again, always close
	}
}
