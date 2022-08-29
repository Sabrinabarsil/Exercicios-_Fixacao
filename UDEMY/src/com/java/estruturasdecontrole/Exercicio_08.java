package com.java.estruturasdecontrole;

import java.util.Scanner;

/*
 8. Criar um programa que receba uma palavra e imprime
  no console letra por letra.
 */




public class Exercicio_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = scan.nextLine();
		
		char letra [] = palavra.toCharArray();
		
		for (int i =0; i < palavra.length(); i++)
			System.out.println(letra[i]);
		
		
		
		scan.close();

	}

}
