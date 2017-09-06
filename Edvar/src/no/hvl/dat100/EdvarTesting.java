package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class EdvarTesting {

	public static void main(String[] args) {
		
		String melding = "";
		
		
		String tall = showInputDialog("Skriv ett tall mellom 1-3");
		int riktigTall = parseInt(tall);
		
		if (riktigTall == 2) {
			melding = "Du har ritkig";
		} else if (riktigTall > 2) {
			melding = "Du har feil";
		} else if (riktigTall < 2) {
			melding = "Du har feil";
		}
		showMessageDialog(null, melding);
		
		}
		
		
		
	}
