package grundkurs;

public class kapitel01_FormatierteSusgabeMit_f {

	public static void main(String[] args) {
		double gewicht = 67.3f;
		double groesse = 1.68f;
		double bmi = gewicht / (groesse * groesse);
		
		System.out.printf("\nGewicht: %.2f kg\n", gewicht);
		System.out.printf("Größe: %.2f m\n", gewicht);
		System.out.printf("Errechneter BMI: %.2f", bmi);
	}

}
