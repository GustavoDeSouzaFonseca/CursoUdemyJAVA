package br.com.curso.exercicios.view;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,aTri,aCir,aTrap, aQuad, aRet;
		double  pi = 3.14159;
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
//		a) a área do triângulo retângulo que tem A por base e C por altura.
			aTri = (A*C)/2;
			System.out.printf("TRIANGULO: %.3f%n", aTri);
//		b) a área do círculo de raio C. (pi = 3.14159)
			aCir = pi*C*C;
			System.out.printf("CIRCULO: %.3f%n", aCir);
//		c) a área do trapézio que tem A e B por bases e C por altura.
			aTrap = ((A+B)/2)*C;
			System.out.printf("TRAPEZIO: %.3f%n", aTrap);
//		d) a área do quadrado que tem lado B.
			aQuad = B*B;
			System.out.printf("QUADRADO: %.3f%n", aQuad);
//		e) a área do retângulo que tem lados A e B.
			aRet = A*B;
			System.out.printf("RETANGULO: %.3f%n", aRet);
		
	}

}
