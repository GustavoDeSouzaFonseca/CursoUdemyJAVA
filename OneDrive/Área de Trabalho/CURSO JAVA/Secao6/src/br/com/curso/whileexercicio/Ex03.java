package br.com.curso.whileexercicio;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================");
		System.out.println(" CODE                     TYPE  ");
		System.out.println("   1                    Alcool  ");
		System.out.println("   2                  Gasolina  ");
		System.out.println("   3                    Diesel  ");
		System.out.println("   4                       Fim  ");
		System.out.println("================================");
		
		int n = sc.nextInt();
		int al, gas, die;
		al = gas = die = 0;
		
		while(n > 0) {
			if (n == 1) {
				al += 1;
				n = sc.nextInt();
			}else if(n == 2) {
				gas += 1;
				n = sc.nextInt();
			}else if(n == 3) {
				die += 1;
				n = sc.nextInt();
			}else if(n == 4){
				System.out.printf("MUITO OBRIGADO!%nAlcool: %d%nGasolina: %d%nDiesel: %d", al, gas, die);
				break;
			}else {
				System.out.print("Valor Nulo%nDigite um valor que esteja cadastrado com CODE.");
				n = sc.nextInt();
			}
		}
		
		
	}
}
