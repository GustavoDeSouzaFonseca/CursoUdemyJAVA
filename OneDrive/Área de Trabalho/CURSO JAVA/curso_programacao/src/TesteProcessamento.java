
public class TesteProcessamento {

	public static void main(String[] args) {
		System.out.println("==============================================");
		System.out.println("                   IN�CIO");
		System.out.println("        Processamento de Dados e Castings");
		System.out.printf("______________________________________________%n%n");
		System.out.println("                  Exemplo 1");
		int x;
		double c,y;
		c=5;
		y= 2 * c;
		System.out.println(y);
		
		
		//EXEMPLO 3
		//Calculando a �rea de um trap�zio
		System.out.println("==============================================");
		System.out.println("                  Exemplo 2");
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = ((b+B)/2.0)*h;
		
		System.out.println(area);
		
		
		//EXEMPLO 4
		System.out.println("==============================================");
		System.out.println("                  Exemplo 3");
		
		int a, d, j;
		double resultado, restSemCasting, resp, k;
		
		a = 5;
		d = 2;
		
		k = 5;
		j = 2;
		
		resp = (int) k/j;
		
		restSemCasting = a/d;
		
		resultado = (double) a/d;
		System.out.println(restSemCasting + " Sem Casting");
		System.out.println(resultado + " Com Casting");
		System.out.printf("______________________________________________%n%nEx 3.1: %n%n");
		System.out.println(resp + " Mudando de DOUBLE para INT");
		
		
	}

}
