package br.com.curso.exercicios.view;

import java.util.Locale;

public class ExFixacao {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		
		
		System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%n"
				+ "Record: %d years old, code %d and %s%n%nMeasure with eifht decimal places:"
				+ "%.8f%nRouded (Three decimal places): %.3f%nUs decimal point:", product1, price1, product2, price2, age, code, gender, measure, 
				measure);
		Locale.setDefault(Locale.US);
		double measureUS = 53.234567;
		System.out.print(measureUS);

	}

}
