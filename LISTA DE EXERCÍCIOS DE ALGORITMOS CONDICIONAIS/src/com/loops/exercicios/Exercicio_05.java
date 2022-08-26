package com.loops.exercicios;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		double soma, media;
	
		System.out.print("Informe um valor: ");
	double num = scan.nextDouble();
	
	
		
		while(num > 0) {
			System.out.print("\nInforme um valor: ");
			double num2 = scan.nextInt();
			
			soma = num + num2;
			media = soma/2;
			num++;
			
			System.out.printf("\nA soma é %.0f " , soma);
			System.out.printf("\nA media é %.2f" , media);
			
		}
		
		
		scan.close();

	}

}
