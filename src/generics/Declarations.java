package generics;

import java.util.*;

class Car {
}

class Cat {

}

class see<you> {
	<here> void amethod(here param) {
	}
}

class NumberHolder<_ extends Number, h> {
}

class RentalGeneric<r> {
	private List<r> rentalPool;
	// "T" is for the type
	// parameter
	// Use the class type for the
	// List type
	private int maxNum;

	public RentalGeneric(int maxNum, List<r> rentalPool) { // constructor takes
															// a
		// List of the class type
		this.maxNum = maxNum;
		this.rentalPool = rentalPool;
	}

	public r getRental() {
		// we rent out a T
		// blocks until there's something available
		return rentalPool.get(0);
	}

	public void returnRental(r returnedThing) { // and the renter
		// returns a T
		rentalPool.add(returnedThing);
	}

	<T> void makeArrayList(T t) {

		List<T> list = new ArrayList<T>();
		// take an object of
		// unknown type and use
		// "T" to represent the
		// now we can create
		// list using "T"
		list.add(t);
	}
}

public class Declarations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// make some Cars for the pool
		Car c1 = new Car();
		Car c2 = new Car();
		List<Car> carList = new ArrayList<Car>();
		carList.add(c1);
		carList.add(c2);
		RentalGeneric<Car> carRental = new RentalGeneric<Car>(2, carList);
		// now get a car out, and it won't need a cast
		Car carToRent = carRental.getRental();
		carRental.returnRental(carToRent);
		// can we stick something else in the original carList?
		// carList.add(new Cat()); // COMPILER ERROR DUH...

		Cat c1é = new Cat();
		Cat c2é = new Cat();
		List<Cat> catList = new ArrayList<Cat>();
		catList.add(c1é);
		catList.add(c2é);
		RentalGeneric<Cat> catRental = new RentalGeneric<Cat>(2, catList);
		// now get a car out, and it won't need a cast
		Cat catToRent = catRental.getRental();
		catRental.returnRental(catToRent);
	}

}
