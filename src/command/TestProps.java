package command;

import java.util.*;

public class TestProps {
	static public void main(String... args) {
		Properties p = System.getProperties();
		p.setProperty("myProp", "myValue");
		p.list(System.out);
	}
}