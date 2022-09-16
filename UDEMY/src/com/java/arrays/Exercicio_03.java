package com.java.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas notas você gostaria de registrar? "); // DEFININDO O TAMANHO DO ARRAY
		int qtd = scan.nextInt();

		double[] notas = new double[qtd];

		for (int i = 0; i < notas.length; i++) { // ARMAZENANDO OS VALORES NO ARRAY
			System.out.print((1 + i) + "º nota: ");
			notas[i] = scan.nextDouble();
		}
		System.out.println("Notas Registradas:" + Arrays.toString(notas));
		
		double soma=0;
		for(double nota: notas) {
			soma += nota;
		}
		
		double media = soma / notas.length;
		
		System.out.printf("Média das notas registradas: %.1f ", media);
		
		
		scan.close();
		
	}
}
