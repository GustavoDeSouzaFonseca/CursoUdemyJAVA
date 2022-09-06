package br.com.curso.estrutura.condicional.ex;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("NÚMERO PAR");
		}else {
			System.out.println("NÚMERO ÍMPAR");
		}
		
		sc.close();
	}
}
