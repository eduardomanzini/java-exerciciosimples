import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercicio_treinando {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o horario"));
		JOptionPane.showInternalMessageDialog(null, x);
		
		
		
		sc.close();		
	}

}
