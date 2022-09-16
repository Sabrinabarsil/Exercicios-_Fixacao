package com.java.arrays;

import java.util.Arrays;


public class Exercicio_01 {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];

		System.out.println("Aluno A:");
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println(Arrays.toString(notasAlunoA));

		double totalA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalA += notasAlunoA[i];

		}
		double mediaA = totalA / notasAlunoA.length;
		System.out.printf("Média do aluno: %.2f", mediaA);

		// media aluno B com declação de valores do array

		double[] notasAlunoB = { 7.5, 9.0, 10.0 };

		double totalB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalB += notasAlunoB[i];

		}

		double mediaB = totalB / notasAlunoB.length;
		System.out.println("\n \nAluno B: ");
		System.out.println(Arrays.toString(notasAlunoB));
		System.out.printf("Média do aluno: %.2f", mediaB);
	}
}
