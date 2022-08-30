package com.java.classesemetodos;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto();

		p1.nome = "Agenda 2023";
		p1.preco = 39.90;
		p1.desconto = 0.05;
		
		Produto p2 = new Produto();

		p2.nome = "Jogo de Canetas Strabillo";
		p2.preco = 72.90;
		p2.desconto = 0.10;
		
		double precoFinal = p1.precoComDesconto();
		
		System.out.printf("R$ %.2f" , precoFinal);

	}

}
