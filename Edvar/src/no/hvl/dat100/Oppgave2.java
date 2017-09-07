package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {

	public static void main(String[] args) {

		double moms1 = 0.00;
		double moms2 = 0.93;
		double moms3 = 22.41;
		double moms4 = 11.52;
		double moms5 = 14.52;

		String bruttoInntekt = showInputDialog("Skriv inn Bruttoinntekt: ");
		int brutto = parseInt(bruttoInntekt);

		if (brutto <= 164100) {
			double skatt1 = (moms1 / 100) * brutto;
			showMessageDialog(null, skatt1);
		} else if (brutto >= 164101 && brutto <= 230950) {
			double skatt2 = (moms2 / 100) * brutto;
			showMessageDialog(null, skatt2);
		} else if (brutto >= 230951 && brutto <= 580650) {
			double skatt3 = (moms3 / 100) * brutto;
			showMessageDialog(null, skatt3);
		} else if (brutto >= 580651 && brutto <= 934050) {
			double skatt4 = (moms4 / 100) * brutto;
			showMessageDialog(null, skatt4);
		} else if (brutto > 935051) {
			double skatt5 = (moms5 / 100) * brutto;
			showMessageDialog(null, skatt5);
		}

	}

}
