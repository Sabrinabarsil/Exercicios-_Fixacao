package com.java.pratica;


import java.util.Scanner;

public class Exercicio_003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe quantos quilometrôs você percorreu de carro");
		double kmRodado = scan.nextDouble();
		
		System.out.println("Informe quantos litros de gasolina você gastou");
		double gasolina = scan.nextDouble();
		
		double mediaDeGasto = kmRodado / gasolina;
		
		System.out.println("Sua média de consumo foi de foi de " + mediaDeGasto + "km rodado por litro");

		scan.close();

	}

}
