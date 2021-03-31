package Modulo2;
import javax.swing.JOptionPane;

public class AnalisiVotiOggetto {

	public static void main(String[] args) {
		
		 String primoVoto, secondoVoto, terzoVoto; // inizializzo variabili String
		 int valPrimoVoto, valSecondoVoto, valTerzoVoto; // inizializzo variabili int
		 double media; // inizializzo variabile double
		 
		 primoVoto = JOptionPane.showInputDialog("inserisci il primo voto.\n"
			 		+ "Ricorda deve essere compreso tra 0 e 30"); // inserisco primo voto
		 valPrimoVoto = Integer.parseInt(primoVoto);  // primo voto acquisito
		 
		 secondoVoto= JOptionPane.showInputDialog("inserisci il secondo voto."
			 		+ "\nRicorda deve essere compreso tra 0 e 30");  // inserisco secondo voto
		 valSecondoVoto = Integer.parseInt(secondoVoto);  // secondo voto acquisito
		 
		 terzoVoto= JOptionPane.showInputDialog("inserisci il terzo voto."
			 		+ "\nRicorda deve essere compreso tra 0 e 30"); // inserisco terzo voto
		 valTerzoVoto = Integer.parseInt(terzoVoto); // terzo voto acquisito
		 
		 media = (double)(valPrimoVoto+valSecondoVoto+valTerzoVoto)/3;// calcolo media
		 
		 JOptionPane.showMessageDialog(null, "Media voti:" +media);
		
		 if(media>=18)
			 JOptionPane.showMessageDialog(null, "Esito positivo");
		 
		 System.exit(0);
		 
	} //fine metodo main ()

} //fine classe AnalisiVoti
