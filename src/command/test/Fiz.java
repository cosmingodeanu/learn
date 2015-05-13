package command.test;

import command.Foo;

public class Fiz extends Foo {
	public static void main(String[] args) {
		Foo fS = new Foo();
		//Can't access
//		System.out.print(" " + f.a);
//		System.out.print(" " + f.b);
//		System.out.print(" " + new Fiz().a);
		System.out.println(" " + new Fiz().b);
	}
}