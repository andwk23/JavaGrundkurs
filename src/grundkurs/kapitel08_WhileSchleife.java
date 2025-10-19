package grundkurs;

public class kapitel08_WhileSchleife {

	public static void main(String[] args) {
		double groesse = 1.68;
		double gewicht = 42.0;
		//Tabellenkopf

		System.out.println("Gewicht\tGröße\tBMI-Wert   Auswertung");
		System.out.println("---------------------------------------");
		
		while (gewicht <= 80.0) {
			
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
			gewicht +=2;
		}
	}

}
