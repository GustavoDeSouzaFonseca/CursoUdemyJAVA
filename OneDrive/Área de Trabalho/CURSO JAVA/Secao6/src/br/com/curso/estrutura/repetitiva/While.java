package br.com.curso.estrutura.repetitiva;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de X: ");
		double x = sc.nextDouble();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			System.out.println("Digite o valor de X: ");
			x = sc.nextDouble();
		}System.out.printf("A SOMA foi de = %d",soma);
		
		sc.close();
	}

}
