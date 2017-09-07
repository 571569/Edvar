package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Test {

	public static void main(String[] args) {

		boolean gyldig = false;

		while (!gyldig) {
			String Heltall = showInputDialog("Skriv inn et heltall større enn 0: ");
			int n = parseInt(Heltall);
			if (n>0) {
				int Sum = 1;
				for (int i = 1; i <= n; i++) {
					Sum = Sum * i;
				}
				gyldig = true;
				String sum = "Summen av " + n + "! er: " + Sum;
				showMessageDialog(null, sum);
				System.out.println(Sum);
			}
		}
	}
}
