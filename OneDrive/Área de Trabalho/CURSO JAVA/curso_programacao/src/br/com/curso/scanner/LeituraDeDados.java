package br.com.curso.scanner;
import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("|==============================|");
		System.out.println("|            IN�CIO            |");
		System.out.println("| Leitura de dados com Scanner |");
		System.out.println("|______________________________|");
		System.out.println("|       Scanner em String      |");
		System.out.printf("|Digite o valor de x:          |%n");
		String x;
		x = sc.nextLine();		
		System.out.println("|Voc� digitou o valor: " + x);
		System.out.println("|______________________________|");
		System.out.printf("|Teste em valor de INT         |%n");
		int y;
		y = sc.nextInt();
		System.out.println("|Voc� digitou o valor: " + y );
		System.out.println("|______________________________|");
		System.out.printf("|Teste em valor de Double      |%n");
		double z;
		z = sc.nextDouble();
		System.out.println("|Voc� digitou o valor: " + z );
		System.out.println("|______________________________|");
		System.out.printf("|Teste em valor de CHAR      |%n");
		char w;
		w = sc.next().charAt(0);
		System.out.println("|Voc� digitou o valor: " + w );
		System.out.println("|==============================|");
		
		sc.close();
		
	}

}
