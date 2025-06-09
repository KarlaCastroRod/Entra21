package treshoras;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// declaração de variáveis
		double vlrSalarioPessoa, vlrSalarioNovo = 0, vlrAbono = 0;
		int cargoPessoa;
		String descCargo = "";


		char encerraProg = 'N';
		
		while(encerraProg == 'N') {

			// entrada de dados
			System.out.println("Cargos");
			System.out.println("1 - Serviços Gerais   2 - Vigia");
			System.out.println("3 - Recepcionista     4 - Vendedor\n");
			System.out.println("Informe o seu cargo");
			cargoPessoa = sc.nextInt();
			System.out.println("Informe o seu salário atual");
			vlrSalarioPessoa = sc.nextDouble();	
			// testar cargo e aplicar cálculos para o novo salário
			switch (cargoPessoa) {
			case 1:
				vlrAbono = vlrSalarioPessoa * 0.50;
				descCargo = "Serviços Gerais";
				break;
			case 2:
				vlrAbono = vlrSalarioPessoa * 0.30;
				descCargo = "Vigia";
				break;
			case 3:
				vlrAbono       = vlrSalarioPessoa * 0.25;
				descCargo = "Recepcionista";
				break;
			case 4:
				vlrAbono = vlrSalarioPessoa * 0.15;
				descCargo = "Vendedor";
				break;
			}
			vlrSalarioNovo = vlrSalarioPessoa + vlrAbono;			
			// imprimir cargo, vlr abono e salário novo
			System.out.println("Cargo.......: " + descCargo);
			System.out.println("Vlr abono ..: " + "R$ " + vlrAbono);
			System.out.println("Salário Novo: " + "R$ " + vlrSalarioNovo);

			System.out.println("Finaliza o programa?(S/N)");
			encerraProg = sc.next().toUpperCase().charAt(0);
		}
		sc.close();		
	}
	}