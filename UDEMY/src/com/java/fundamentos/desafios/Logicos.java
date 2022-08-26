package com.java.fundamentos.desafios;

public class Logicos {

	public static void main(String[] args) {

		System.out.println("Tabela Verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);// código morto
//		System.out.println(false && false);// código morto
		
		System.out.println("\nTabela Verdade OU (OR)");
//		System.out.println(true || true); // código morto
//		System.out.println(true || false);// código morto
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade OU EXCLUSIVO (XOR)");
		System.out.println(true ^ true); 
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("\nTabela Verdade NOT"); // OPERADOR UNARIO
		System.out.println(!true); 
		System.out.println(!false);
		
		
	}
		
}
