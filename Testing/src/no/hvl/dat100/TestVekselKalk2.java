package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class TestVekselKalk2 {

	public static void main(String[] args) {
		
		String tallTxt = showInputDialog("Skriv inn bel�p:");
		
		int pris = 86;
		int bel�p = parseInt(tallTxt);
		int veksel = bel�p - pris;
		
		if (pris<=bel�p) {
		int ant20kr = veksel / 20;
		int resten = veksel - ant20kr * 20;
		int ant10kr = resten / 10;
		int ant1kr = resten % 10;
		String ut1 = "Du har betalt: " + bel�p + "\n"
				 + "Veksel er: " + veksel + "\n"
				+ "antall 20kr er: " + ant20kr + "\n"
				+ "antall 10kr er: " + ant10kr + "\n"
				+ "antall 1kr er: " + ant1kr;
		
		showMessageDialog(null,ut1);
		
		System.out.println("Du har betalt: " + bel�p + "kr");
		System.out.println("Veksel er: " + veksel + "kr");
		System.out.println("antall 20kr er: " + ant20kr);
		System.out.println("antall 10kr er: " + ant10kr);
		System.out.println("antall 1kr er: " + ant1kr);
		
		}
		
		else {
			int mangler = pris - bel�p;
			String ut2 = "Ikke betalt nok!" + "\n"
					+ "Du mangler: " + mangler + "kr";
			showMessageDialog(null,ut2);
			
			System.out.println("Ikke betalt nok!");
			System.out.println("Du mangler: " + mangler + "kr");
		

					
		}	

	}

}
