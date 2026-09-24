package com.calculadora.calculadorajava;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

try (Scanner scanner = new Scanner(System.in)) {
	System.out.println("Seja bem vindo a calculadora de terminal");
	System.out.println("Esse é o Menu, selecione a opção qual deseja calcular!");

	String escolha;
		do {

		System.out.println("Digite:");
		System.out.println("A para adicionar | S para subtrair | D para dividir | M para multiplicar | E para sair");

		escolha = scanner.nextLine();

		if (escolha.equalsIgnoreCase("a")) {
			
			System.out.println("Somando!");
			
			System.out.println("Digite um número para somar");
			int n1 = scanner.nextInt();

			System.out.println("Digite outro número para somar");
			int n2 = scanner.nextInt();

			scanner.nextLine();	
			
			System.out.println("A soma de " + n1 + " com " + n2 + " é igual a " + (n1 + n2));

		} else if (escolha.equalsIgnoreCase("s")) {

			System.out.println("Subtraindo!");
	
			System.out.println("Digite um número para subtrair");
			int n1 = scanner.nextInt();

			System.out.println("Digite outro número para subtrair");
			int n2 = scanner.nextInt();

			scanner.nextLine();

			System.out.println("A subtração de " + n1 + " com " + n2 + " é igual a " + (n1 - n2));

		} else if (escolha.equalsIgnoreCase("d")) {

			System.out.println("Dividindo!");
	
			System.out.println("Digite um número para dividir");
			int n1 = scanner.nextInt();

			System.out.println("Digite outro número para dividir");
			int n2 = scanner.nextInt();

			scanner.nextLine();

			System.out.println("A divisão de " + n1 + " com " + n2 + " é igual a " + (n1 / n2));

		} else if (escolha.equalsIgnoreCase("m")) {

			System.out.println("Multiplicando!");
	
			System.out.println("Digite um número para multiplicar");
			int n1 = scanner.nextInt();

			System.out.println("Digite outro número para multiplicar");
			int n2 = scanner.nextInt();

			scanner.nextLine();

			System.out.println("A multiplicação de " + n1 + " com " + n2 + " é igual a " + (n1 * n2));
		
		} else if (!escolha.equalsIgnoreCase("e")) {
			
			System.out.print("Essa não é uma operação válida, digite um caracter correto"); 
			
		}

		} while (!escolha.equalsIgnoreCase("e"));
	
	System.out.println("Saindo...");
	
	}
	}
}
