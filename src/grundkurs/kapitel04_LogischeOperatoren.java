package grundkurs;

public class kapitel04_LogischeOperatoren {

	public static void main(String[] args) {
		double gewicht = 67.3;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		boolean uebergewicht = (bmi >= 25);
		boolean untergewicht = (bmi < 18);
		boolean normalgewicht = !uebergewicht & ! untergewicht;
		boolean nichtnormalgewicht = (bmi >= 25) || (bmi < 18); // shor-curcuit evaluation für 'oder' = ||
		
		System.out.printf("\nGewicht: %.2f kg\n", gewicht);
		System.out.printf("Größe: %.2f m\n", groesse);
		System.out.printf("Errechneter BMI-Wert: %.2f\n", bmi);
		
		System.out.println("\nZeigt der BMI-Wert ein Übergewicht an? [false = nein, true = ja]: " + uebergewicht);
		System.out.println("Zeigt der BMI-Wert ein Untergewicht an? [false = nein, true = ja]: " + untergewicht);
		System.out.println("Zeigt der BMI-Wert ein Unter- oder Übergwicht an? [false = nein, true = ja]: " + nichtnormalgewicht);
		
		if (normalgewicht) {
			System.out.println("\n---------------------------------");
			System.out.println("Das Gewicht liegt in Normbereich.");
		}
		else if(uebergewicht) {
			System.out.println("\n-----------------------");
			System.out.println("Eine Diät ist angesagt!");
		}
		else {
			System.out.println("\n--------------------------");
			System.out.println("Das Gewicht ist zu gering!");
		}
	}

}
