package com.java.estruturasdecontrole.desafios;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um dia da Semana");
		String dia = scan.nextLine();
		
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println("1");
	}
		else if (dia.equalsIgnoreCase("Segunda") || dia.equalsIgnoreCase("segunda-feira")) {
			System.out.println("2");
	}
		else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println("3");
	}	
		else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println("4");
	}	
		else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
	}
		else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println("6");
	}
		else if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println("7");
	}
		else{
			System.err.print("ENTRADA INVALIDA \n Ex: de entrada valida: Segunda-feira, Quinta-Feira etc...");
					}
		scan.close();
		
	}
}

//		System.out.print("Informe um numero de 1 a 7: ");
//		int num = scan.nextInt();
//
//		if (num == 1) {
//			System.out.println("DOMINGO");
//		}
//		else if (num == 2) {
//			System.out.println("SEGUNDA-FEIRA");
//		}
//		else if (num == 3) {
//			System.out.println("TERÇA-FEIRA");
//		}
//		else if (num == 4 ) {
//			System.out.println("QUARTA-FEIRA");
//		}
//		else if (num == 5) {
//			System.out.println("QUINTA-FEIRA");
//		}
//		else if (num == 6) {
//			System.out.println("SEXTA-FEIRA");
//		}
//		else if (num == 7) {
//			System.out.println("SABADO");
//		} else {
//			System.err.print("O numero digitado é invalido \nINFORME UM NUMERO DE 1 A 7");
//		}
