package no.hvl.dat100;

public class Oppgave1 {

	public static void main(String[] args) {
		int i;

		System.out.println("test av repitisjonssetningen.");
		System.out.println("*****************************");

		i = 1;
		while (i <= 10) {

			System.out.println("dette er linje nr. " + i);

			if (i == 4) {
				System.out.println();
			}

			if (i == 8) {
				System.out.println();
			}

			i = i +1;
		}

	}

}
