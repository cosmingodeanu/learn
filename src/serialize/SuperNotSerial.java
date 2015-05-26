package serialize;

import java.io.*;

class SuperNotSerial {
	public static void main(String[] args) {
		Dog2 d = new Dog2(35, "Fido");
		System.out.println("before: " + d.name + " " + d.weight);
		
		try {
			FileOutputStream fs = new FileOutputStream("testSer.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(d);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileInputStream fis = new FileInputStream("testSer.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			d = (Dog2) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("after: " + d.name + " " + d.weight);
	}
}

class Dog2 extends Animal implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;

	Dog2(int w, String n) {
		weight = w;		// inherited
		name = n;		// not inherited
	}
}

class Animal {
	int weight = 42;
}