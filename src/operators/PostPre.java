package operators;

public class PostPre {

    public static void main(String[] args) {

        int i = 0;
        int a = i++;
        System.out.println("a=" + a);
        i=0;
        a=++i;
        System.out.println("a=" + a);
    }
}
