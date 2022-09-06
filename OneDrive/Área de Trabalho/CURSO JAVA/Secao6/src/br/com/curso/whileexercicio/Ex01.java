package br.com.curso.whileexercicio;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		System.out.println("Insira a senha: ");
		int resp = sc.nextInt();
		while(resp != senha) {
			System.out.println("Senha inválida");
			System.out.println("Insira a senha: ");
			resp = sc.nextInt();
		}System.out.println("Acesso permitido!");

	}

}
