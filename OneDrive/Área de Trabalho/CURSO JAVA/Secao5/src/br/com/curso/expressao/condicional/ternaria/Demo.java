package br.com.curso.expressao.condicional.ternaria;

public class Demo {
	public static void main(String[] args) {
		double preco = 34.5;
		String desconto = (preco < 20.0) ? "preco * 0.1" : "preco * 0.05";
		System.out.println(desconto);
	}
}
