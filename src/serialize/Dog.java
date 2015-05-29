package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	transient private Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size) {
		System.out.println("dog constructor ran once");
		theCollar = collar;
		setDogSize(size);
	}

	public Collar getCollar() {
		return theCollar;
	}

	public int getDogSize() {
		return dogSize;
	}

	public void setDogSize(int dogSize) {
		this.dogSize = dogSize;
	}

	private void writeObject(ObjectOutputStream os) {
		// throws IOException {
		try {
			os.writeInt(theCollar.getCollarSize());
			os.defaultWriteObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream is) {
		// throws IOException, ClassNotFoundException {
		try {
			is.defaultReadObject();
			theCollar = new Collar(is.readInt());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Collar c = new Collar(3);
		Dog d = new Dog(c, 5);
		System.out.println("before: collar size is "
				+ d.getCollar().getCollarSize());
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
			d = (Dog) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("after: collar size is "
				+ d.getCollar().getCollarSize());
	}
}
