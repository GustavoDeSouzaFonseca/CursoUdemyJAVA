package br.com.curso.exercicios.view;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int code1, n1, code2, n2;
		double vu1, vu2, valorTotal;
		
		System.out.println("Digite o code da pe�a 1: ");
		code1 = sc.nextInt();
		System.out.println("Digite o n�mero de pe�as 1: ");
		n1 = sc.nextInt();
		System.out.println("Digite o valor unit�rio de cada pe�a 1: ");
		vu1 = sc.nextDouble();
		System.out.println("Digite o code da pe�a 2: ");
		code2 = sc.nextInt();
		System.out.println("Digite o n�mero de pe�as 2: ");
		n2 = sc.nextInt();
		System.out.println("Digite o valor unit�rio de cada pe�a 2: ");
		vu2 = sc.nextDouble();
		
		valorTotal = (n1*vu1)+(n2*vu2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		
	}

}
