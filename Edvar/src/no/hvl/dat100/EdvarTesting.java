package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class EdvarTesting {

	public static void main(String[] args) {
		String Feil = "Tallet er ikke over 0.";
		boolean gyldigTall = false;

		String Heltall = showInputDialog("Skriv inn et heltall større enn 0: ");
		int n = parseInt(Heltall);

		if (n <= 0) {
			showMessageDialog(null,Feil);
		}
		else {

			int Sum = 1;
			for (int i = 1; i <= n; i++) {
				Sum = Sum * i;
			}
			System.out.println(Sum); 		

		}
	}
}