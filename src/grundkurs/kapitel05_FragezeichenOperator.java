package grundkurs;

public class kapitel05_FragezeichenOperator {

	public static void main(String[] args) {
		double gewicht = 67.3;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		
		System.out.printf("\nErrechneter BMI-Wert: %.2f\n", bmi);
		
		System.out.println((bmi>=25) ? "Übergewicht" : (bmi < 18) ? "Untergewicht" : "Normalgewicht");
	}

}
