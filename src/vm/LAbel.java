package vm;

public class LAbel {
	static String o;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
z: o = o +2;
	for(int x = 3;x<8;x++){
		if(x==4)
			break;
		if(x==6);
//			break z;//label placed incorrectly 
	}
	}

}
