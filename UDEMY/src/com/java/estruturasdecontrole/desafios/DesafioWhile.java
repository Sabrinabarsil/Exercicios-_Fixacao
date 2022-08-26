package com.java.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Você diz: ");
		String frase = scan.nextLine();
		
		while (!frase.equalsIgnoreCase("sair")) {
			
			System.out.print("Você diz: ");
			frase = scan.nextLine();
			
			scan.close();

		}

	}

}
