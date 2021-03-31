package modulo3;

public class SelezioneDoppiaMultipla {

	public static void main(String[] args) {
		int voto = 23;
		
		if (voto < 18)
			System.out.println("bocciato    ");
		else
			if (voto <=20 )
				System.out.println("sufficiente");
			else
				if (voto <=25 )
					System.out.println("buono");
				else 
					System.out.println("ottimo");
		
		

	} //fine main

}//fine classe multipla  
