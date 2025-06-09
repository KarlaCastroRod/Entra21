package teste2la;

import javax.swing.JOptionPane;

public class segundatentativa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor da peça."));
		int final1;
		int pagam = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a forma de pagamento \n 1- Cheque ou dinheiro \n 2- Cartão de crédito \n 3- Duas vezes \n 4- Três vezes"));
		switch (pagam) {
		case 1 :
			final1 = (int) (  valor - (valor * 0.1) );
			JOptionPane.showMessageDialog(null, " você precisa pagar " + final1);
			break;
		case 2 :
			final1 = (int) ( valor - (valor * 0.15) );
			JOptionPane.showMessageDialog(null, "você precisa pagar " + final1);
			break;
		case 3 :
			final1 = valor;
			JOptionPane.showMessageDialog(null, "você precisa pagar " + final1);
			break;
		case 4 :
			final1 = (int) (valor + (valor * 0.1) );
			JOptionPane.showMessageDialog(null, "você precisa pagar " + final1);
			break;
		default :
			JOptionPane.showMessageDialog(null, "Valor fora do padrão, por favor indique um número entre 1 e 4");
		}
	}
}

