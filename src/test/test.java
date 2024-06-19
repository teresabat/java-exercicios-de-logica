package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String user;
		int senha;

		System.out.println("Digite seu user:");
		user = scanner.nextLine();

		System.out.println("Digite sua senha:");
		senha = scanner.nextInt();

		if (user.equals("admin") && senha == 123) {
			System.out.println("Logado com sucesso!");
		} else {
			System.out.println("Login ou senha incorretos!");
		}
		scanner.close();
	}	

}
