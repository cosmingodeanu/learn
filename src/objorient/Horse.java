package objorient;

import objorient.has_a.Halter;

public class Horse {
	private Halter myHalter = new Halter();

	public void tie(Object rope) {
		myHalter.tie(rope); // Delegate tie behavior to the Halter object
	}
}
