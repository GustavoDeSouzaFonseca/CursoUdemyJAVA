package br.com.curso.estrutura.condicional.ex;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número inteiro: ");
		n = sc.nextInt();
		
		if(n>=0) {
			System.out.println("NAO NEGATIVO");
		}else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
