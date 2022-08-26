package com.java.estruturasdecontrole.desafios;

public class DesafioLaçoFor {

	/* Crie a seguinte estrutura
	   #
  	   ##
	   ###
	   ####
  	   #####
	   Sem ultilizar nenhum valor numerico para controlar o laço
	 */
	
	
	
	public static void main(String[] args) {


		for(String a="#"; !a.equals("######"); a +="#") {
			System.out.println(a);
			
		}
	}

}
