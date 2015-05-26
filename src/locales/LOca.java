package locales;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LOca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2010, 11, 14);

		// December 14, 2010
		// (month is 0-based
		Date d2 = c.getTime();
		Locale locIT = new Locale("it", "IT");
		Locale locPortugal = new Locale("pt");
		Locale locBr = new Locale("pt", "BR");
		Locale locIN = new Locale("hi", "IN");
		Locale locJA = new Locale("ja");
		
		DateFormat dfUS = DateFormat.getInstance();
		System.out.println("US=" + dfUS.format(d2));
		DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("US full =" + dfUSfull.format(d2));
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy=" + dfIT.format(d2));
		DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL,
				locPortugal);
		System.out.println("Portugal =" + dfPT.format(d2));
		DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBr);
		System.out.println("Brazil=" + dfBR.format(d2));
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
		System.out.println("India=" + dfIN.format(d2));
		DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
		System.out.println("Japan=" + dfJA.format(d2));

	}

}
