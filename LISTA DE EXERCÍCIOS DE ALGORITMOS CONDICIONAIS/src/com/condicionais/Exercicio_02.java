package com.condicionais.exercicios;


import javax.swing.JOptionPane;

//2) Faça um algoritmo que leia o nome, o sexo e o estado civil de uma pessoa. Caso sexo seja “F” e
//estado civil seja “CASADA”, solicitar o tempo de casada (anos). 

public class Exercicio_02 {
	public static void main(String[] args) {

		
		
		String nome, sexo, estadoCivil;
		int tempoCasada=0;
		
		nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		sexo = JOptionPane.showInputDialog("Sexo: F (feminino) / M (masculino)");
		
		estadoCivil =JOptionPane.showInputDialog("Estado Civil: S(solteiro[a]) / C (casado[a])");
		
		if(sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("C") ){
			tempoCasada= Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo de casada"));
		}
		System.out.println("Nome: " + nome);
		System.out.println("Sexo: " + sexo);	
		System.out.println("Estado Civil: " + estadoCivil);
		System.out.println("Casada a  " + tempoCasada + " anos");
		
		
		
		
		
		
		
		
	}

}
