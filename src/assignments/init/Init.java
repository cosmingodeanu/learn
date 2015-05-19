package assignments.init;

public class Init {
	static {
		System.out.println("static Init class ");
	}
    Init(int x) {

        System.out.println("1-arg const");
    }

    public Init() {

        System.out.println("no-arg const");
    } 

    static {
        System.out.println("1st static init");
    }
    {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {

        new Init();
        new Init(7);
    }
}