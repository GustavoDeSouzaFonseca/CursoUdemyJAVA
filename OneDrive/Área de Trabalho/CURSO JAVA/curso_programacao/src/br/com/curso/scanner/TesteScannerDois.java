package br.com.curso.scanner;

import java.util.Scanner;

public class TesteScannerDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===================================");
		System.out.println("               ERRO!");
		System.out.println("Digite um N�mero junto a uma String");
		System.out.println("e ap�s 2 strings com \"enter\"");
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("==========================================");
		System.out.println("               CERTO!");
		System.out.println("Digite um N�mero e tr�s Strings utilizando");
		System.out.println("\"enter\"");
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("===========================================");
		System.out.println("COM NextLINE() AP�S NextINT()");
		System.out.println("DADOS DIGITADOS: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
