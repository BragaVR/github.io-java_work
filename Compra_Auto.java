package Esercizi_Ripasso;
import java.util.Scanner;
public class Compra_Auto {

	public static void main(String[] args) {
		System.out.println("Vuoi comprare una macchina?");
		try (Scanner scan = new Scanner(System.in)) {
			String Risp1 = scan.next();
			
			if (Risp1.equals("si")) {
				System.out.println("di che marca la vorresti tra:Alfa-Lancia-Maserati");
				String Risp2 = scan.next();
				
				if (Risp2.equals("Alfa")) {
					System.out.println("si cè l'abbiamo,ti piacerebbe provarla?");
					String Risp3 = scan.next();
					
					if (Risp3.equals("si")) {
						System.out.println("ottimo!abbiamo una quadrifoglio pronta all'uso");
					}
					else {
						System.out.println("fa' niente sarà per un altra volta");
						}
					
					
					
				}
					
					
				else if (Risp2.equals("Lancia")) {
					System.out.println("Non ne abbiamo,dobbiamo ordinarla");
				}
				else {
					System.out.println("per questo modello bisognerà aspettare qualche mese");
				}
			}
			
			else {
				System.out.println("torni quando avrà i soldi,straccione");
			}
		}
		System.exit(0);

	}

	
}
