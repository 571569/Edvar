package no.hvl.dat100;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class SekunderKonvertering {

	public static void main(String[] args) {
		
		String in1 = showInputDialog("Skriv antall sekunder");
		
		int Sek = parseInt(in1);
		int totalMin = Sek / 60;
		int min = (Sek / 60)%60;
		int totalTime = totalMin / 60;
		int time = totalMin / 60;
		int sekunder = Sek % 60;
		
		String ut1 = Sek + " Sekunder blir til, " + time + " timer, " + min + " minutter, "
			+ sekunder + " sekunder.";
		
		showMessageDialog(null,ut1);
				
		// FOR Å SE UTREGNINGENE MENS JEG PROGRAMMERTE.
				System.out.println(Sek);
		System.out.println(totalMin);
		System.out.println(min);
		System.out.println(totalTime);
		System.out.println(time);
		System.out.println(sekunder);
		
	}

}
