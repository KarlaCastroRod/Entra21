package exercicios;

import java.util.Scanner;

public class atividades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
			System.out.println("informe o numero");
			numeros[i] = sc.nextInt();
			soma += numeros[i];
		}
		System.out.println("Números informados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] + " ");
        }

        System.out.println("Soma dos números: " + soma);
        sc.close();
    }
}