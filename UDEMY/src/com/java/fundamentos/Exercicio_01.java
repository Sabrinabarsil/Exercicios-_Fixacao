package com.java.fundamentos;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		Double  tempF;
		
		System.out.println("Informe a Temperatura em Graus Celsius (C°)");
		Double tempC = scan.nextDouble();
		 
		tempF = (tempC * 1.8 )+32;
		
		System.out.printf("A temperatura convertida é equivalente a %.1f °F", tempF);
		
		
		scan.close();
	}

}
