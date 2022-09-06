package br.com.curso.debug;

import java.util.Locale;
import java.util.Scanner;

public class UsoBreakpoint {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double metroQuadrado;
		
		System.out.println("Digite a largura: ");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento: ");
		double comprimento = sc.nextDouble();
		System.out.println("Digite quantos metros quadrados: ");
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA %.2f%n", area);
		System.out.printf("PRECO %.2f%n", preco);
		
		sc.close();
	}

}
