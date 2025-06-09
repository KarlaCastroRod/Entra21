package aula2;
import java.util.Scanner;
public class vetores2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	double[] notas = new double[3];
	double somaNotas = 0;
	
	for (int i = 0;  i < 3; i++) {
		System.out.println("Informe a nota " + (i + 1) + " : ");
		notas[i] = sc.nextDouble();
		somaNotas += notas [i];
	}
	
	for(int i = 0; i < 3; i++) {
		System.out.println(notas[i]);
	}
	System.out.println("Média do aluno: " +(somaNotas/3));
	
	sc.close();
	}

}
