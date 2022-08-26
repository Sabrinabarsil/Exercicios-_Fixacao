package com.java.estruturasdecontrole;

import java.util.Scanner;

/*3. Criar um programa que receba duas notas parciais,
 * calcular a média final. Se a nota do aluno for maior
 * ou igual a 7.0 imprime no console "Aprovado", se a nota 
 * for menor que 7.0 e maior do que 4.0 imprime no console 
 * "Recuperação", caso contrário imprime no console "Reprovado".
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Notas\nInforme a 1° e 2° Nota: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();

		double mediaFinal = (nota1 + nota2) / 2;

		if (mediaFinal >= 7.0) {
			System.out.println("Aprovado!");
		} else if (mediaFinal >=4.0  && mediaFinal < 7.0) {
			System.out.println("Recuperação!");
		} else {
			System.out.println("Reprovado");
		}
		scan.close();
	}

}
