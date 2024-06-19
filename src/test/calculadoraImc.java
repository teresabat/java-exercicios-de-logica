package test;

import java.util.Scanner;

public class calculadoraImc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("digite seu peso:");
		double peso = scanner.nextDouble();

		System.out.println("digite sua altura:");
		double altura = scanner.nextDouble();

		double imc = peso / (altura * altura);

		System.out.println("Seu imc é: " + imc);

		if (imc < 18.5) {
			System.out.println("ta magro");
		} else if (imc > 18.5 && imc < 30) {
			System.out.println("Você esta no seu peso ideal!");
		} else if(imc > 30 && imc < 40) {
			System.out.println("Ta gordo");
		}else {
			System.out.println("Ta quase morrendo");
		}
		scanner.close();
	}
}