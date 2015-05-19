package objorient.ovwrite_ovload;

public class TestAnimals {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
		float f =3.4f;
		double d = 4.1;
		char i = 0;
		int in = 0;
		byte bey =0;
		in=i;
		d=f;
		in=bey;
//		bey = in;//err
//		f=d; //err
//		i=in; //err
	}
}
interface Playable {
	public void play();
}
class Animal implements Playable{
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}

class Horse extends Animal implements Playable{
	public void eat() {
		System.out.println("Horse eating hay, oats, " + "and horse treats");
	}

	public void buck() {
	}
}