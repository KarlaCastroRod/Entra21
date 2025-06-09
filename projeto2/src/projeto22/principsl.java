package projeto22;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class principsl {

	public static void main(String[] args) {
	//Scanner sc = new Scanner(System.in);
	int idadePessoa;
	System.out.println("informe a idade daa pessoa");
	//idadePessoa = sc.nextInt();
	idadePessoa = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da pessoa"));
	if(idadePessoa >= 18) {
		JOptionPane.showMessageDialog(null, "Entrada Liberada !!");
		} else {
			JOptionPane.showMessageDialog(null, "entrada não liberada!!");
		}
	}

}
