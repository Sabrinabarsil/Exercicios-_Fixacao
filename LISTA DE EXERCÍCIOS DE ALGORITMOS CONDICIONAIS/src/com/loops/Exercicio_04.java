package com.loops.exercicios;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int NUM_ENTREVISTADOS = 3;
		Double nFilhos=0.0, salario=0.0, somaSalario,somaFilhos, mediaSalario, mediaFilhos;
		

		System.out.println("Por favor responda as seguintes perguntas: ");

		for (int i = 0; i < NUM_ENTREVISTADOS; i++) {
			System.out.println((i+1) + "º Entrevistado \n" + "Seu Salario R$ ");
			salario = scan.nextDouble();
			System.out.println("Numero de filhos");
			nFilhos = scan.nextDouble();
		}
		
		somaSalario =+ salario;
		somaFilhos =+ nFilhos;
		
			
		mediaSalario = somaSalario/NUM_ENTREVISTADOS;
		mediaFilhos= somaFilhos/NUM_ENTREVISTADOS;
		
		System.out.println("A media salarial da população é de R$ " + mediaSalario);
		System.out.println("A media de filhos da população é de " + mediaFilhos);
		
		
		scan.close();
		}

	}


