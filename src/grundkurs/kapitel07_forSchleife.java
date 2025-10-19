package grundkurs;

import java.util.Iterator;

public class kapitel07_forSchleife {

	public static void main(String[] args) {

		double groesse = 1.68;
		
		//Tabellenkopf
		System.out.println("Gewicht\tGröße\tBMI-Wert   Auswertung");
		System.out.println("---------------------------------------");
		
		for (double gewicht=42.0; gewicht <= 80.0; gewicht += 2) {			
			double bmi = gewicht / (groesse * groesse);
			
			System.out.printf("%.2f\t%.2f\t%.2f\t   ", gewicht,groesse,bmi);
			
			int intBMI = (bmi>=25) ? 1 : (bmi < 18) ? -1 : 0;
			
			switch (intBMI) {
			case 0:
				System.out.println("Normalgewicht");
				break;
			case 1:
				System.out.println("Übergewicht");
				break;
			case -1:
				System.out.println("Untergewicht");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + intBMI);
			}
		}
		
		

	}

}
