package vm;

public class EnumTEsts {
public enum Dogs{collie, harrier}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d = Dogs.collie;
		switch(d){
		case collie: System.out.println("collie");
		case harrier: System.out.println("harrier");}

	}

}
