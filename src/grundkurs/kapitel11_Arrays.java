package grundkurs;

import java.util.Iterator;

public class kapitel11_Arrays {

	public static void main(String[] args) {
		double[] gewicht = new double[16]; // das Array enthält 15 Daten (0 bis 14) vom Typ double
		double[] groesse = new double[] {1.50, 1.55, 1.60, 1.65, 1.68, 1.70, 1.75, 1.80}; // Befüllung eines Arrays mit einer Wertereihe
		
		// oder auch double[] groesse = {1.50, 1.55, 1.60, 1.65, 1.68, 1.70, 1.75, 1.80}; 
		
		System.out.println("\nJe nach Datentyp werden Arrays automatisch initialisiert:");
		System.out.printf("Gewicht[0] = %.2f  --  Gewicht[1] = %.2f usw.\n", gewicht[0], gewicht[1]);
		
		//Initialisierung von gewicht[0] für die for-Schleife
		gewicht[0] = 38.0;
		
		for (int i = 1; i <= 15; i++) {
			// Befüllung des Datenarrays gewicht
			
			System.out.printf("\nGewicht %2d: %.2f kg", i ,gewicht[i] = gewicht[i-1] + 2);		
		}
		System.out.println("\n----------------------------------------------");
		System.out.println("\nAusgabe des Größenarrays");
		
		for(int i = 0; i <= groesse.length-1; i++) {
			System.out.printf("\ngröße[%d]: %.2f m", i ,groesse[i]);	
		}
		System.out.println();
		
		System.out.println("\nGewicht\tGröße\tBMI-Wert   Auswertung");
		System.out.println("---------------------------------------");
		
		for (int i = 1; i <= 15; i++) {			
			double bmi = gewicht[i] / (groesse[4] * groesse[4]);
			
			System.out.printf("%.2f\t%.2f\t%.2f\t   ", gewicht[i],groesse[4],bmi);
			
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
