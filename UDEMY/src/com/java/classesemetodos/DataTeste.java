package com.java.classesemetodos;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(); // constutor defaul
		
		Data d2 = new Data(17, 1, 2013);

		Data d3 = new Data(19, 5, 2015);

		Data d4 = new Data(31, 3, 2020);

		Data d5 = new Data();
		d5.ano=1988;


		System.out.print("A Sabrina nasceu em " + d1.dataFormatada());
		System.out.print("\nA Maria nasceu em " + d2.dataFormatada());
		System.out.print("\nO Pedro nasceu em " + d3.dataFormatada());
		System.out.print("\nA Isis nasceu em " + d4.dataFormatada());
		System.out.print("\nO Helton nasceu em " + d5.dataFormatada());

	}

}
