package assignments.arrays;

class Car {
}

class AthleticShoe {
}

interface Sporty {
	void beSporty();
}

class Ferrari extends Car implements Sporty {
	public void beSporty() {
		// implement cool sporty method in a Ferrari-specific way
	}
}

class RacingFlats extends AthleticShoe implements Sporty {
	public void beSporty() {
		// implement cool sporty method in a RacingShoe-specific way
	}
}

class GolfClub {
}

public class TestSportyThings {
	public static void main(String[] args) {
		Sporty[] sportyThings = new Sporty[3];
		sportyThings[0] = new Ferrari();// OK, Ferrari implements Sporty
		sportyThings[1] = new RacingFlats(); // OK, RacingFlats implements
												// Sporty
//		sportyThings[2] = new GolfClub(); // Not OK; GolfClub does not implement
											// Sporty
											// I don't care what anyone says

	}
}