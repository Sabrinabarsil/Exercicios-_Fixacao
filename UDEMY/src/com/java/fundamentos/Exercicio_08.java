package com.java.fundamentos;

/*Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
 * Encontre o delta
 */

public class Exercicio_08 {

	public static void main(String[] args) {

		double a = 1, b = 12, c = -13;
//		System.out.printf("EQUAÇÃO: %dx² + %dx + %d = 0", a, b, c);

		System.out.println("Formula Delta = b²-4.a.c");
		double delta = (b * b) - (4 * a * c);
		
		System.out.print("O Delta é: " + delta );
		

	}

}
