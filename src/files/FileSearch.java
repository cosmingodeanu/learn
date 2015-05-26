package files;

import java.io.File;

public class FileSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] files = new String[2];
		File search = new File("existingDir");
		files = search.list();
		for (String fn : files)
			System.out.println("found "
					+ fn
					+ " that is a directory="
					+ new File(search.getAbsolutePath() + "/" + fn)
							.isDirectory());
		// create the list

	}

}
