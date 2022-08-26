package com.java.estruturasdecontrole.desafios;

import javax.swing.JOptionPane;

public class EstruturasDeControle {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe um numero");
		int num = Integer.parseInt(valor);
		
		if(num % 2 == 0) 
			System.out.println("O numero é par");
			else {
				System.out.println("O numero é impar");
		
		}
		
		
		
	}
}
