package br.com.curso.exercicios.view;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, soma;
		System.out.print("Digite o primeiro n�mero: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		B = sc.nextInt();
		soma = A + B;
		System.out.print("A soma entre "+ A +" e "+ B +" foi de: "+ soma);
		
		
		sc.close();
	}
	
}
