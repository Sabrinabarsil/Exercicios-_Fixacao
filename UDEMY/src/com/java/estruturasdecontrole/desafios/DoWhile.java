package com.java.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DoWhile {

	// Estrutura Do while
	// Executa pelo menos 1 vez o código
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String texto = "";

		do {
			System.out.println("Você não disse a palavra magicaaaa...");
			System.out.println("Quer sair? ");
			texto = scan.nextLine();

		} while (!texto.equalsIgnoreCase("Por favor"));
		
		System.out.println("Obrigada! Apreciamos sua educação");
		scan.close();
	}

}
