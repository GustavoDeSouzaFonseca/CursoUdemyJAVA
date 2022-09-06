package br.com.curso.estrutura.condicional.ex;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n;
		System.out.println("Digite um n�mero: ");
		n = sc.nextDouble();
		
		if(n>=0 && n<25) {
			System.out.println("INTERVALO ENTRE [0;25]");
		}else if(n<50 && n>0) {
			System.out.println("INTERVALO ENTRE [25;50]");
		}else if(n<75 && n>0){
			System.out.println("INTERVALO ENTRE [50;75]");
		}else if(n<100 && n>0) {
			System.out.println("INTERVALO ENTRE [75;100]");
		}else {
			System.out.println("FORA DE INTERVALO");
		}
	}

}
