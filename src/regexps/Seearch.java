package regexps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Seearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ab");
		// the expression
		Matcher m = p.matcher("abaaaba");
		// the source
		while (m.find()) {
			System.out.print(m.start() + " ");
		}

	}

}
