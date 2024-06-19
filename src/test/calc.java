package test;

import java.util.Scanner;

public class calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite seu primeiro numero: ");
		double num1 = scanner.nextDouble();

		System.out.println("Digite a operação matematica: ");
		char operacao = scanner.next().charAt(0);

		System.out.println("Digite seu segundo numero: ");
		double num2 = scanner.nextDouble();

		double resultado = 0;

		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':
			if (num2 != 0) {
				resultado = num1 / num2;
			} else {
				System.out.println("Erro! Divisão por zero não é permitida!");
				return;
			}
			break;
		default:
			System.out.println("Operação invalida!");
			return;
		}
		System.out.println("Seu resultado é: " + resultado);
		scanner.close();
	}
}
