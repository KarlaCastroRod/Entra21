package vetores;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] idade = new int[3];
		idade[0] = 14;
		idade[1] = 15;
		idade[2] = 18;
		System.out.println("Posição 2: " + idade[2]);

		String[] nomes = new String[3];
		nomes[0] = "Camila";
		nomes[1] = "Chris";
		nomes[2] = "Vinicius";

		System.out.println("Posição 0:" + nomes[0]);

		System.out.println("Informe a nome da posição 2: ");
		nomes[2] = sc.nextLine();

		System.out.println("Você informou o nome:" + nomes[2]);
		sc.close();
		double[] notas = new double[3];
		System.out.println("Informe a primeira nota: ");
		notas[0] = sc.nextDouble();

		System.out.println("Informe a segunda nota: ");
		notas[1] = sc.nextDouble();

		System.out.println("Informe a terceira nota: ");
		notas[2] = sc.nextDouble();
		
		System.out.println("Notas: \n" +notas[0]+", "+notas[1]+", "+notas[2]); 
		sc.close();
	}
}
