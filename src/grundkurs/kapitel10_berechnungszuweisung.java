package grundkurs;

public class kapitel10_berechnungszuweisung {

	public static void main(String[] args) {
		double groesse = 1.68;
		double gewicht = 42.0;
		//Tabellenkopf

		System.out.println("Gewicht\tGröße\tBMI-Wert   Auswertung");
		System.out.println("---------------------------------------");
		
		do {
			
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
			gewicht +=2.0; // Berechnungszuweisung +=, -=, usw
			
			if ((gewicht > 50.) & (gewicht < 72.)) {
				++gewicht; // Inkrementierungszuweisung, bei Zuweisungen wird sofort inkrementiert und dann zugewiesen
				gewicht++; // Inkrementierungszuweisung, bei Zuweisungen wird erst zugewiesen und dann inkrementiert
			}
		}while (gewicht <= 80.0);

	}

}
