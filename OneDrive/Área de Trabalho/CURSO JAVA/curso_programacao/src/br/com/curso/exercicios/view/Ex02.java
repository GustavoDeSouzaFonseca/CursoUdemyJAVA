package br.com.curso.exercicios.view;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double r, a;
		
		System.out.println("Digite o raio de um c�rculo: ");
		r = sc.nextDouble();
		
		a = pi*r*r;
		System.out.printf("A �rea do c�rculo foi de: %.4f", a);
	}
	
}
