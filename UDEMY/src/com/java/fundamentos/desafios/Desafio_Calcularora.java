package com.java.fundamentos.desafios;

import java.util.Scanner;

public class Desafio_Calcularora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Informe o 1° valor: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Informe a opeção desejada:\nsoma (+) , subtração(-), multiplicação(*), divisão(/) \n");
		String operacao = scan.next();
		
		System.out.print("Informe o 2° valor: ");
		double num2 = scan.nextDouble();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		 resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		 resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		 resultado = "/".equals(operacao) ? num1 / num2 : resultado;

		System.out.printf("%.0f %s %.0f= %.0f", num1 , operacao , num2  , resultado);
		
		scan.close();
	}

}
