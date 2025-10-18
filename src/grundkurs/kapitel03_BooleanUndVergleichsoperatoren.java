package grundkurs;

public class kapitel03_BooleanUndVergleichsoperatoren {

	public static void main(String[] args) {
		double gewicht = 67.3;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		boolean uebergewicht = (bmi >= 25);
		boolean untergewicht = (bmi < 18);
		
		System.out.printf("\nGewicht: %.2f kg\n", gewicht);
		System.out.printf("Größe: %.2f m\n", gewicht);
		System.out.printf("Errechneter BMI: %.2f\n", bmi);
		
		System.out.println("\nZeigt der BMI-Wert ein Übergewicht an? [false = nein, true = ja]: " + uebergewicht);
		System.out.println("Zeigt der BMI-Wert ein Untergewicht an? [false = nein, true = ja]: " + untergewicht);
		
		if(uebergewicht) {
			System.out.println("\nEine Diät ist angesagt!");
		}
		else if(untergewicht){
			System.out.println("Das Gewicht ist zu gering!");
		}else{
			System.out.println("\nDas Gewicht liegt in Normbereich.");
		}
	}
}
