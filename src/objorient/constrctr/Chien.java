package objorient.constrctr;

public class Chien {

    String name;

    Chien(String name) {

        this.name = name;
        System.out.println("arged constrct");
    }

    Chien() {

        this(makeRandomName());
        System.out.println("no arg constrct");

    }

    static String makeRandomName() {

        int x = (int) (Math.random() * 5);

        String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[x];

        return name;

    }

    public static void main(String[] args) {

        Chien a = new Chien();

        System.out.println(a.name);

        Chien b = new Chien("Zeus");

        System.out.println(b.name);

    }
}
