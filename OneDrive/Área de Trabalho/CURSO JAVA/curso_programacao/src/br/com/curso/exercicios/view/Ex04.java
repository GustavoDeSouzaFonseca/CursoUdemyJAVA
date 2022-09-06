package br.com.curso.exercicios.view;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int id, hrTrab;
		double valorHr, salary;
		
		System.out.println("Digite o seu ID: ");
		id = sc.nextInt();
		System.out.println("Digite quantas horas você trabalha por mês: ");
		hrTrab = sc.nextInt();
		System.out.println("Digite quanto você ganha por hora: ");
		valorHr = sc.nextDouble();
		
		salary = hrTrab*valorHr;
		System.out.printf("Number: %d%nSalary: U$%.2f", id, salary);
	}
}
