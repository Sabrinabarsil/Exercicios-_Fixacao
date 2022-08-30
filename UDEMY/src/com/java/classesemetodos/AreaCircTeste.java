package com.java.classesemetodos;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a = new AreaCirc(10);
		// a.pi = 10000;
		AreaCirc a2 = new AreaCirc(5);
		// a2.pi = 0;

		System.out.println(a.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);

	}

}
