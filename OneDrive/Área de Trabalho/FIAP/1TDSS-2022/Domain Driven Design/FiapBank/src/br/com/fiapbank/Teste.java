package br.com.fiapbank;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Instanciando cada classe
		Cliente cn = new Cliente();
		Endereco end = new Endereco();
		ContaCorrente cc = new ContaCorrente();
		
		//Exibir os dados pelo usu�rio
		System.out.println("===================<CLIENTE>===================");
		System.out.println("Digite seu nome: ");
		cn.nome = scanner.next();
		System.out.println("Digite seu cpf: ");
		cn.cpf = scanner.nextLine();
		cn.cpf = scanner.nextLine();
		
		System.out.println("===================<ENDERE�O>==================");
		System.out.println("Digite o nome de sua rua: ");
		end.rua = scanner.nextLine();
		System.out.println("Digite o n�mero da resid�ncia: ");
		end.numero = scanner.nextShort();
		System.out.println("Digite o complemento, se houver: ");
		end.complemento = scanner.nextLine();
		end.complemento = scanner.nextLine();
		System.out.println("Digite o bairro: ");
		end.bairro = scanner.nextLine();
		System.out.println("Digite o CEP: ");
		end.cep = scanner.nextLine();	
		
		System.out.println("================<CONTA_CORRENTE>===============");
		System.out.println("Digite o seu saldo: ");
		cc.saldo = scanner.nextDouble();
		
		System.out.println("loading...");
		System.out.println("===================<FIAP BANK>==================");
		System.out.println("Seja bem vindo " + cn.nome);
		System.out.println("Seu CPF �: " + cn.cpf);
		System.out.println("Rua " + end.rua + ", N�" + end.numero + ", " + end.complemento);
		System.out.println("Bairro " + end.bairro + ", CEP: " + end.cep);
		System.out.println("O SEU SALDO DA SUA CONTA CORRENTE � DE: " + cc.saldo);
		
	}

}
