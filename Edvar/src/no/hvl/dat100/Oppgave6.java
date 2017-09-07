package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Oppgave6 {

	public static void main(String[] args) {

		String melding = "";
		String feil = "Ugyldig poengsum!";
		boolean gyldigPoeng;
		int poeng = 0;

		for (int i = 1; i <= 10; i++) {

			do {
				String poengSum = showInputDialog("Elevens poengsum: ");
				poeng = parseInt(poengSum);
				gyldigPoeng = ((poeng >= 0) && (poeng <= 100));
				if (!gyldigPoeng) {
					showMessageDialog(null, feil);
				}
			} while (!gyldigPoeng);

			if ((poeng <= 100) && (poeng >= 90)) {
				melding = "" + "A";
			}
			if ((poeng <= 89) && (poeng >= 80)) {
				melding = "" + "B";
			}
			if ((poeng <= 79) && (poeng >= 60)) {
				melding = "" + "C";
			}
			if ((poeng <= 59) && (poeng >= 50)) {
				melding = "" + "D";
			}
			if ((poeng <= 49) && (poeng >= 40)) {
				melding = "" + "E";
			}
			if ((poeng <= 39) && (poeng >= 0)) {
				melding = "" + "F";
			}
			showMessageDialog(null, melding);
			System.out.println(melding);
		}

	}

}
