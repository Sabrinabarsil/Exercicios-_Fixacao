package com.java.classesemetodos;

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
	

		System.out.print("A Sabrina nasceu em " + d1.dataFormatada());
		System.out.print("\nA Maria nasceu em " + d2.dataFormatada());
		System.out.print("\nO Pedro nasceu em " + d3.dataFormatada() );
		System.out.print("\nA Isis nasceu em " + d4.dataFormatada() );
		System.out.print("\nO Helton nasceu em " + d5.dataFormatada());

	}

}
