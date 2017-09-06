package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class SummereTall {

	public static void main(String[] args) {
		
		int sum = 0;
		int sum2 = 0;
		boolean gyldigInnData;
		String melding = "skriv ett tall mellom 2 og 20";
		String feilmelding = "feil inntasting, skriv ett tall mellom 2 og 20";
		int n = 0;
		
		do {
			String txt = showInputDialog(null, melding);
			n = parseInt(txt);
			gyldigInnData = (n <= 2) || (n >= 20);
			if (!gyldigInnData) {
				showMessageDialog (null, feilmelding);
			}
		} while (!gyldigInnData);
		
		int teller = 1;
		while (teller < n) {
			sum = sum + teller;
			System.out.print(teller + " + ");
			teller = teller + 1;			
		}
		System.out.print(n + " = " + (sum + n));
		
		for (int i = 1; i < n; i++) { // evt.i = i + 1
			sum2 = sum2 + i; 
			System.out.print(i + " + ");
		}
		System.out.print(n + " = " + (sum2 + n));

	}
}