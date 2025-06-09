package metodo;

import javax.swing.JOptionPane;

public class exericcio2 {

	public static void main(String[] args) {
		String entrada = JOptionPane.showInputDialog("escolha uma pessoa");
		String resposta = entrada.toUpperCase();
		switch (resposta) {
		case "KARLA": {
			karla();
			break;
		}
		case "VINICIUS": {
			Vinicius();
			break;
		}
		case "CAMILA": {
			camila();
			break;
		}
		case "CHRISTIAN": {
			christian();
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "usuario noa encontrado");
		}
	}

	public static void karla() {
		JOptionPane.showMessageDialog(null, "O nome dela é Karla");
		JOptionPane.showMessageDialog(null, "Ela tem 18 anos");
		JOptionPane.showMessageDialog(null, "Ela é estudante do senai");
	}

	public static void Vinicius() {
		JOptionPane.showMessageDialog(null, "O nome dele é Vinicius");
		JOptionPane.showMessageDialog(null, "ele tem 17 anos");
		JOptionPane.showMessageDialog(null, "ele é estudante do senai");
	}

	public static void camila() {
		JOptionPane.showMessageDialog(null, "O nome dela é Camila");
		JOptionPane.showMessageDialog(null, "ela tem 19 anos");
		JOptionPane.showMessageDialog(null, "ela é estudante do senai");

	}

	public static void christian() {

		JOptionPane.showMessageDialog(null, "O nome dele é Christian");
		JOptionPane.showMessageDialog(null, "ele tem 19 anos");
		JOptionPane.showMessageDialog(null, "ele é estudante do senai");
	}
}
