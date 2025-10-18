package grundkurs;

public class kapitel02_explizitesCasting {

	public static void main(String[] args) {
		float gewicht = 67.3f;
		float groesse = 1.68f;
		float bmi = gewicht / (groesse * groesse);
		
		System.out.printf("\nGewicht: %.2f kg\n", gewicht);
		System.out.printf("Größe: %.2f m\n", gewicht);
		System.out.printf("Errechneter BMI: %.2f", bmi);

	}

}
