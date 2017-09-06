package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {

	public static void main(String[] args) {
		String Feil = "Tallet er ikke over 0.";
		boolean gyldigTall;
		int n = 0;
		int Sum = 1;
		int sum = 1;

		do {
			String Heltall = showInputDialog("Skriv inn et heltall større enn 0: ");
			n = parseInt(Heltall);
			gyldigTall = (n > 0);
			if (!gyldigTall) {
				showMessageDialog(null, Feil);
			}
		} while (!gyldigTall);

		for (int i = 1; i <= n; i++) {
			Sum = Sum * i;
		}
		System.out.println(Sum);

		int teller = 1;
		while (teller <= n) {
			sum = sum * teller;
			System.out.print(teller + " * ");
			teller = teller + 1; 
		}
		System.out.println(" = " + sum);
	}
}