package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double num1;
		double num2;
		double resultado = 0;
		char operador;

		;
		System.out.println("-----------CALCULADORA-------------------");

		System.out.println(
				"Escolha a operação a ser realizada:\n(+) SOMA \n(-) SUBTRAÇÃO  \n(*) MULTIPLICAÇÃO  \n(/) DIVISÃO \n ");
		operador = scan.next().charAt(0);
		System.out.println("-----------------------------------------");

		System.out.print("Informe o 1° valor da operação: ");
		num1 = scan.nextDouble();
		System.out.print("\nInforme o 2° valor da operação: ");
		num2 = scan.nextDouble();

		switch (operador) {
		case '+':
			resultado = num1 + num2;
			break;

		case '-':
			resultado = num1 - num2;
			break;

		case '*':
			resultado = num1 * num2;
			break;

		case '/':
			resultado = num1 / num2;
			 if (num2 == 0) {
                 resultado = num1 / num2;
                 System.out.println("Erro: Divisão por zero não é permitida.");
             }
                 
             
			break;

		default:
			System.out.println("Erro");

		}
		System.out.println("-----------------------------------------");
		System.out.print("Resultado = " + resultado);

		scan.close();

	}

}
