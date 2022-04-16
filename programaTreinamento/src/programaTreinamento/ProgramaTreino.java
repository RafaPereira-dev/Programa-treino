package programaTreinamento;

import javax.swing.JOptionPane;

public class ProgramaTreino {
	
	
	public static void main(String[] args) {
		
		/*Recebimento dos dados*/
		String nota1 = JOptionPane.showInputDialog("Insira a nota1");
		String nota2 = JOptionPane.showInputDialog("Insira a nota2");
		String nota3 = JOptionPane.showInputDialog("Insira a nota3");
		String nota4 = JOptionPane.showInputDialog("Insira a nota4");
		
		/*Conversão dos dados para calcular*/
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		/*Media para aprovação é 70*/
		
		if (media >= 50) {
			
		
		if (media >= 70) {
			JOptionPane.showMessageDialog(null, "Aluno esta aprovado com a media de: " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Aluno em recuperação com a media de: " + media);
		}
		
		} else {
			JOptionPane.showMessageDialog(null, "Aluno esta reprovado com media de: " + media);
		}
		
		
		
		
		
	}
}
	
	
	
