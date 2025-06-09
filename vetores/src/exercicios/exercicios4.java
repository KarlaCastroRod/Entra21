package exercicios;

import java.util.Scanner;

public class exercicios4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				double soma = 0;
		double [] novosnumeros = new double [8];
		for (int i = 0; i < novosnumeros.length; i ++) {
			System.out.println("Informe um numero na posição: " + i);
			novosnumeros[i] = sc.nextDouble();
			
			soma = soma + novosnumeros[i];
		}
		double media = soma / novosnumeros.length;
		System.out.println("A media dos numeros digitados: " + media);
		
		for (int i = 0; i < novosnumeros.length; i++) {
			if (novosnumeros[i] > media) {
				System.out.println("valor maior que "+media+ ": "+novosnumeros[i]);
			}
			
		}

	}

}
