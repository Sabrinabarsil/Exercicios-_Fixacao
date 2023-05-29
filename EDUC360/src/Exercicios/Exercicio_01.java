package Exercicios;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("CALCULA AREA: RETANGULO");

		System.out.print("Digite a Base: ");
		double base = scan.nextDouble();

		System.out.print("Digite aAltura: ");
		double altura = scan.nextDouble();

		isQuadrado(base, altura);

	}

	public static void isQuadrado(double base, double altura) {
		double area = base * altura;
		if (base == altura) {
			System.out.printf("É um Quadrado e sua area é de: %.2f", area);
		} else 
			System.out.printf("Não é um Quadrado e sua area é de:%.2f", area);
		}
	
	

	}

