package com.java.arrays;

/*
  FOREACH
*/
	
public class Exercicio_02 {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		System.out.println("Aluno A:");

		double soma = 0;
		for (double notaA : notasAlunoA) {
			System.out.println(notaA);
			soma += notaA;
		}

		double media = soma / notasAlunoA.length;
		System.out.printf("Media do aluno: %.2f", media);
		System.out.print("\n------------------------");

		// MÉDIA ALUNO B

		System.out.println();

		double[] notasAlunoB = { 7.5, 9.0, 10.0 };
		System.out.println("Aluno B:");

		double somaB = 0;
		for (double notaB : notasAlunoB) {
			System.out.println(notaB);
			somaB += notaB;
		}
		media = somaB / notasAlunoB.length;
		System.out.printf("Media do aluno: %.2f", media);

	}

}
