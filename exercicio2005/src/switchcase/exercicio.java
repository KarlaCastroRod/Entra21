package switchcase;

import javax.swing.JOptionPane;

public class exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salario = Integer.parseInt(JOptionPane.showinput(null, "Informe o seu salário."));
		int aumento ;
		int cargo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o seu cargo. \n 1- Serviços Gerais \n 2- Vigia \n 3- Recepcionista \n 4- Vendedor"));
		switch (cargo) {
		case 1 :
			aumento = (int) ((salario * 0.5) + salario);
			JOptionPane.showMessageDialog(null, "Seu salário agora é "+ aumento);
			break;
		case 2 :
			aumento = (int) ((salario * 0.3) + salario);
			JOptionPane.showMessageDialog(null, "Seu salário agora é "+ aumento);
			break;
		case 3 :
			aumento = (int) ((salario * 0.25) + salario);
			JOptionPane.showMessageDialog(null, "Seu salário agora é "+ aumento);
			break;
		case 4 :
			aumento = (int) ((salario * 0.15) + salario);
			JOptionPane.showMessageDialog(null, "Seu salário agora é "+ aumento);
			break;
		default :
			JOptionPane.showMessageDialog(null, "Valor fora do padrão, por favor indique um número entre 1 e 4");
		}
	}
}

	}

}
