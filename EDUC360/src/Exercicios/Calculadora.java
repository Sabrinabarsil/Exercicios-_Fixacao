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
				"Escolha a opera��o a ser realizada:\n(+) SOMA \n(-) SUBTRA��O  \n(*) MULTIPLICA��O  \n(/) DIVIS�O \n ");
		operador = scan.next().charAt(0);
		System.out.println("-----------------------------------------");

		System.out.print("Informe o 1� valor da opera��o: ");
		num1 = scan.nextDouble();
		System.out.print("\nInforme o 2� valor da opera��o: ");
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
                 System.out.println("Erro: Divis�o por zero n�o � permitida.");
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
