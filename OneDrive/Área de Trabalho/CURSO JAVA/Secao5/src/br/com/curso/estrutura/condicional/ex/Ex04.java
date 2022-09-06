package br.com.curso.estrutura.condicional.ex;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio, hrFinal, duracao;
		
		System.out.println("Digite a hora que o jogo começou: ");
		inicio = sc.nextInt();
		System.out.println("Digite a hora que o jogo se encerrou: ");
		hrFinal = sc.nextInt();
		
		if(inicio<hrFinal) {
			duracao = hrFinal - inicio;
		}else {
			duracao = 24 - inicio + hrFinal;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
		sc.close();
	}
}
