package br.com.curso.estrutura.condicional.ex;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		
		if (A % B == 0 ) {
			System.out.println("S�O MULTIPLOS");
		}else if(B % A == 0){
			System.out.println("S�O MULTIPLOS");
		}else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		
		sc.close();
	}
}
