package Esercizi_Ripasso;                 //  made by Braga Giulio

import java.util.Scanner;

public class corsi_semestre {

	public static void main(String[] args) {
		System.out.println("Inserisci il numero di voti del tuo ciclo di studio");
		try (Scanner scan = new Scanner (System.in)) {
			int x = scan.nextInt();
			
			double[] nbcorsi = new double[x];
			double sum = 0;
			
			for (int i = 0; i< nbcorsi.length; i++ ) {
				System.out.println("inserisci il voto numero" + (i+1) + ":");
				nbcorsi[i] = scan.nextDouble();
				
			}
			
			for (int i=0; i<nbcorsi.length; i++ ) {
				sum = sum + nbcorsi[i];
			}
			
			double media = sum/nbcorsi.length; 
			
			System.out.println("la media dei tuoi voti è   "+ media );
			
			if (media > 90 ) {
				System.out.println("il tuo andamento è ottimo ");
			} else if ( 90 >= media && media > 80 ) {
				System.out.println("il tuo andamento è quasi ottimo");
			} else if (80 >= media && media > 70) {
				System.out.println("il tuo andamento è buono");
			} else if (70 >= media && media >= 60) {
				System.out.println("il tuo andamento è sufficente");
			} else if ( media < 60) {
				System.out.println("la tua preparazione non è sufficente");
			} else {
				System.out.println("dovrai ripetere l'anno");
			}
			
			System.exit(0);
			
			
		}

		
	}

}                                                         //made by Braga Giulio
