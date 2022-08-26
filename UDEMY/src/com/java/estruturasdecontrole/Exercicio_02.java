package com.java.estruturasdecontrole;

// 2. Criar um programa informa se o ano atual é um ano bissexto;


import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("CONTADOR DE ANOS BISSEXTOS\nInforme o anom(ex:. 1993) :");
		int ano = scan.nextInt();

		if (ano % 4 == 0 && (ano % 400 == 0 || ano % 100 != 0)) {

			System.out.println("O informado ano é bissexto");

		} else {
			System.out.println("O ano informado não é bissexto");
		}
		scan.close();
	}

}
