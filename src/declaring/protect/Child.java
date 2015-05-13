package declaring.protect;

import declaring.Parent;

class Child extends Parent {
	public void testIt() {
		System.out.println("x is " + x); // No problem; Child
		// inherits x
		Parent p = new Parent(); // Can we access x using the p reference?
		// System.out.println("X in parent is " + p.x); // Compiler error!
	}
}

enum CoffeeSize {
	BIG, HUGE,
	OVERWHELMING {
		// start a code block that defines
		// the "body" for this constant
		public String getLidCode() {
			// override the method
			// defined in CoffeeSize
			return "A";
		}
	};
	// the semicolon is REQUIRED when more code follows
	public String getLidCode() {
		return "B";
	}
}