package grundkurs;

public class kapitel03_BooleanUndVergleichsoperatoren {

	public static void main(String[] args) {
		double gewicht = 67.3;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		
		System.out.printf("\nGewicht: %.2f kg\n", gewicht);
		System.out.printf("Größe: %.2f m\n", gewicht);
		System.out.printf("Errechneter BMI: %.2f", bmi);
	}
}
