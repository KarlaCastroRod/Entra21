package metodo;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.println("Digite o número");
		  int tempo = sc.nextInt();
	      
	      switch (tempo) {
	          case 1:  
	              System.out.println("verao");
	              System.out.println("O tempo está quente");
	              break;
	          case 2:
	              System.out.println("outono");
	              System.out.println("época de cair folhas");
	              break;
	          case 3:  
	                System.out.println("inverno");
	                System.out.println("está muito frio");
	              break;
	          case 4:  
	              System.out.println("primaveira");
	              System.out.println("época de flores");
	          default:
	                System.out.println("Número inválido");
	      }
	      sc.close();
	}
	
}