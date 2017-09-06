package no.hvl.dat100;

public class oppgaver {

	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		int teller = 0;
		while(teller<=10) {
			sum2 = sum2 + teller;
			teller = teller + 1;
		}
		System.out.println(sum2);
		
		int kvadratsum = 0;
		for (int i = 1; i <= 10; i++) {
			kvadratsum = kvadratsum + i*i;
		}
		System.out.println(kvadratsum);
		
		
	}

}
