package br.com.curso.funcoes.matematicas;

public class FuncoesMath {
	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C, D, E;
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		D = Math.max((int)x, y);
		E = Math.min(x, y);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		System.out.println("Maior n�mero entre " + x +" e "+ y +" �: " + D);
		System.out.println("Menor n�mero entre " + x +" e "+ y +" �: " + E);
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);
	}
}