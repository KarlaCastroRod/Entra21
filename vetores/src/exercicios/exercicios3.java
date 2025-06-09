package exercicios;

import java.util.Scanner;

public class exercicios3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double[] novosnumeros = new double [8];
		double soma = 0;
		for (int i = 0; i < novosnumeros.length; i++) {
			System.out.println("Informe um numero na posição ");
			novosnumeros [i] = sc.nextDouble();
			soma = soma + novosnumeros[i];
		}
		System.out.println("A média dos numeros digitados foi: " + (soma/novosnumeros.length));
		
		sc.close();
	}

}
