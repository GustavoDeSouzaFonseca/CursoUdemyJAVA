package br.com.curso.estrutura.condicional.ex;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int code, qnt;
		double price;
		String especify;
		
		System.out.println("_____________________________");
		System.out.println("|CODE     ESPECIFY     PRICE|");
		System.out.println("|=-=-=-=-=-=-=-=-=-=-=-=-=-=|");
		System.out.println("| 1      HotDog        $4,00|");
		System.out.println("| 2      X-salad       $4,50|");
		System.out.println("| 3      X-Bacon       $5,00|");
		System.out.println("| 4      TorradaSimple $2,00|");
		System.out.println("| 5      Soda          $1,50|");
		System.out.println("|___________________________|");
		
		System.out.println("");
		System.out.println("code: ");
		code = sc.nextInt();
		System.out.println("How many: ");
		qnt = sc.nextInt();
		
		if(code == 1) {
			price = qnt * 4.00;
		}else if(code == 2) {
			price = qnt * 4.5;
		}else if(code == 3) {
			price = qnt * 5;
		}else if(code == 4) {
			price = qnt * 2;
		}else if(code == 5) {
			price = qnt * 1.5;
		}else {
			price = 0;
			System.out.println("ISN'T A CODE");
		}
		System.out.printf("TOTAL: $%.2f%n", price);
		
		
		
		
		sc.close();
		
	}
}
