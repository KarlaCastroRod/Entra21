package projeto16horas;

import javax.swing.JOptionPane;

public class horas {

	public static void main(String[] args) {
		
		  double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe seu peso"));
	        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura")); 
	        double imc = peso / (altura * altura);
	        if(imc >= 16 && imc <= 16.9) {
	       JOptionPane.showMessageDialog(null, "Seu imc eta muito baixo!");
	        }else if ( imc >= 17 && imc <= 18.4) {
	        	JOptionPane.showMessageDialog(null,  "você está abaixo do peso");
	        }else if ( imc >= 18.5 && imc <= 24.9) {
	        	JOptionPane.showMessageDialog(null,  "você está abaixo do peso");
	        }else if ( imc >= 25.0 && imc <= 29.9) {
	        	JOptionPane.showMessageDialog(null,  "você está acima do peso");
	        }else if ( imc >= 30.0 && imc <= 34.9) {
	        	JOptionPane.showMessageDialog(null,  "você está obeso");
	        }else if ( imc >= 35.0 && imc <= 40.0) {
	        	JOptionPane.showMessageDialog(null,  "você está obeso grau II");
	        }else if ( imc > 40.0) {
	        	JOptionPane.showMessageDialog(null,  "você está obeso grau III");
	         }
	        }
	     }
	
	