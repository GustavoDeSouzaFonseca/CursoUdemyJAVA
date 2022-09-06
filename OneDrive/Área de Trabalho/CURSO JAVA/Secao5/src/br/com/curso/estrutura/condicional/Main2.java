package br.com.curso.estrutura.condicional;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hr;
		
		System.out.println("Digite quantas horas: ");
		hr = sc.nextInt();
		
		if(hr < 12) {
			System.out.println("Bom dia!");
		}else if(hr < 18){
			System.out.println("Boa Tarde!");
		}else {
			System.out.println("Boa Noite!");
		}
		
		sc.close();
	}

}
