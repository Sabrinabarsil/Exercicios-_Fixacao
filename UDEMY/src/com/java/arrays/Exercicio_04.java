package com.java.arrays;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe a quantidade de Alunos: ");
		int qtdAlunos = scan.nextInt();
		
		double soma=0;

		System.out.print("Informe a quantidade de notas por Alunos: ");
		int qtdNotas = scan.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma.length; n++) {
				System.out.print("Informe a " + ( n+1) + "° nota do "+ (1+a) + "º aluno: ");
				notasDaTurma[a][n] = scan.nextDouble();
				
				soma += notasDaTurma[a][n];
			}
		}
		
		double media = soma / (qtdAlunos*qtdNotas);
		
		System.out.printf("Media da turma: %.1f ", media);

		scan.close();
	}

}
