package com.produtividade_ide.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		Scanner input  = new Scanner(System.in);
		
		int a, b;
		
		System.out.print("Entre com o valor de A: ");
		a = input.nextInt();
		System.out.print("Entre com o valor de B: ");
		b = input.nextInt();
		
		System.out.println("\nO valor da SOMA é: " + soma(a, b));
		
		System.out.println("\nO valor da SUBTRAÇÃO é: " + subtracao(a, b));
		
		System.out.println("\nO valor da MULTIPLICAÇÃO é: " + multiplicacao(a, b));
		
 		System.out.println("\nO valor da DIVISÃO é: " + divisao(a, b));
		
		
	}
 
	public static int soma(int a, int b) {

		return a + b;
	}

	public static int subtracao(int a, int b) {

		return a - b;
	}

	public static int multiplicacao(int a, int b) {

		return a * b;
	}

	public static double divisao(double a, double b) {

		return a / b;
	}

}
