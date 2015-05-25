package strings;

public class StringBuffs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("0123456789");
		System.out.println(sb.delete(4,6));		// output is "01236789"
		System.out.println(sb);
	}

}
