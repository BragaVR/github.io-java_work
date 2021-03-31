package Esercizi_Ripasso;

import java.util.Scanner;

public class basic_test {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Benvenuto nel test di Braga Giulio");
			System.out.println("Domanda2 : quanto fà 2 + 2 in lettere?");
			String Risp1 = scan.next();
			
			while (!Risp1.equals("quattro")) {
				System.out.println("la tua risposta è sbagliata, prova di nuovo");
				Risp1 = scan.next();
			}
			
			
			System.out.println("bene la risposta è esatta");
			System.out.println("Domanda1 : qual è il capoluogo del veneto?");
			
			String Risp2 = scan.next();
			while (!Risp2.equals("Venezia")) {
				System.out.println("la tua risposta è sbagliata, prova di nuovo");
				Risp2 = scan.next();
			}
			
			System.out.println("bravo! la risposta è esatta");
			System.out.println("Domanda2: Come si chiama la stella al centro del sistema solare?");
			
			
			String Risp3 = scan.next();
			while (!Risp3.equals("Sole")) {
				System.out.println("la tua risposta è sbagliata, prova di nuovo");
				Risp3 = scan.next();
			}
			
			
			
			System.out.println("bravo! la risposta è esatta");
			System.out.println("Domanda3: Dove punta la freccia della bussola?");
			
			
			String Risp4 = scan.next();
			while (!Risp4.equals("Nord")) {
				System.out.println("la tua risposta è sbagliata, prova di nuovo");
				Risp4 = scan.next();
				
			}
			System.out.println("bravo! la risposta è esatta");
			System.out.println("Domanda4: Di che colore era il cavallo bianco di Napoleone?");
			
			
			String Risp5 = scan.next();
			while (!Risp5.equals("bianco")) {
				System.out.println("la tua risposta è sbagliata, prova di nuovo");
				Risp5 = scan.next();
				
			}
			
			System.out.println("bravo! la risposta è esatta");
			System.out.println("Domanda5: Qual è il nome e cognome del creatore di questo breve e semplice test? \n (scrivilo senza spaziature)");
			
			
			String Risp6 = scan.next();
			while (!Risp6.equals("GiulioBraga")) {
				System.out.println("la tua risposta è sbagliata, prova di nuovo");
				Risp6 = scan.next();
				
			}
		}
		System.out.println("complimenti davvero! hai completato il test!");
		System.out.println("Grazie del tempo dedicatomi,alla prossima!!");
		
		System.exit(0);
	}
	
	

}
