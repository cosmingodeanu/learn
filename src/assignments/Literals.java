package assignments;

public class Literals {
	public static void main(String[] args) {
		int i = 07;
//		int i = 08; //compiler error
//		char c =-1; //compiler error
		int y = 0x7fffffff;
		int z = 0xDeadCafe;
		int zé = 010022222210;
		float zéé =  12.2F;
		double d = 12.5f;
		float f = (float) 1D;
		byte c = 127;
//		byte b = 1l; //compiler error
		float fé;
		if(args[0]!=null){
			fé = 0;
		} else fé=1;
		System.out.println(fé);
	}
}
