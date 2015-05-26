package serialize;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
	transient private Collar theCollar;
	private int dogSize;

	public Dog(Collar collar, int size) {
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
			os.defaultWriteObject();
			os.writeInt(theCollar.getCollarSize());
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
}
