package com.java.fundamentos;

public class Exercicio_02 {

	public static void main(String[] args) {
		
		String a= "Bom dia Veronica \n";
		String b = "Subi num onibus no marrocos";
		
		String nome= "Cassia";
		String senha = "cAsSiA";
		
		
		
		
		System.out.println(a.repeat(5));
		System.out.println(b.length());
		
		System.out.println(nome.equals(senha)); // compara conteudo
		System.out.println(nome.equalsIgnoreCase(senha));// compara conteudo ignorando maiusculas e minusculas

		
//	  OBS:
//		  .trim( retira os espaços em branço) ou usar o .next();
		
	}

}
