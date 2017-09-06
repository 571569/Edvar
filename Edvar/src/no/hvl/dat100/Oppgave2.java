package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Oppgave2 {

	public static void main(String[] args) {

		String moms1 = "0,00%";
		String moms2 = "0,93%";
		String moms3 = "2,41%";
		String moms4 = "11,52%";
		String moms5 = "14,52%";
		String bruttoInntekt = showInputDialog("Skriv inn Bruttoinntekt: ");
		int brutto = parseInt(bruttoInntekt);

		if (brutto <= 164100) {
			showMessageDialog(null, moms1);
		}
		else if (brutto >= 164101 && brutto <= 230950) {
			showMessageDialog(null, moms2);
		}
		else if (brutto >= 230951 && brutto <= 580650) {
			showMessageDialog(null, moms3);
		}
		else if (brutto >= 580651 && brutto <= 934050) {
			showMessageDialog(null, moms4);
		}
		else if (brutto > 935051) {
			showMessageDialog(null, moms5);
		}



	}

}
