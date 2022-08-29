package com.java.classes;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();

		d1.dia = 07;
		d1.mes = 5;
		d1.ano = 1991;

		Data d2 = new Data();

		d2.dia = 17;
		d2.mes = 1;
		d2.ano = 2013;

		Data d3 = new Data();

		d3.dia = 19;
		d3.mes = 5;
		d3.ano = 2015;
		
		Data d4 = new Data();

		d4.dia = 31;
		d4.mes = 3;
		d4.ano = 2020;
		
		Data d5 = new Data();

		d5.dia = 04;
		d5.mes = 8;
		d5.ano = 1988;
		
		
		System.out.printf("A Sabrina nasceu em %d/%d/%d" ,d1.dia, d1.mes, d1.ano);
		System.out.printf("\nA Maria nasceu em %d/%d/%d" ,d2.dia, d2.mes, d2.ano);
		System.out.printf("\nO Pedro nasceu em %d/%d/%d" ,d3.dia, d3.mes, d3.ano);
		System.out.printf("\nA Isis nasceu em %d/%d/%d" ,d4.dia, d4.mes, d4.ano);
		System.out.printf("\nO Helton nasceu em %d/%d/%d" ,d5.dia, d5.mes, d5.ano);
            
	}

}
