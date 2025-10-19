package grundkurs;

public class kapitel06_switchcase {

	public static void main(String[] args) {
		double gewicht = 67.3;
		double groesse = 1.68;
		double bmi = gewicht / (groesse * groesse);
		
		System.out.printf("\nErrechneter BMI-Wert: %.2f\n", bmi);
		
		int intBMI = (bmi>=25) ? 1 : (bmi < 18) ? -1 : 0;
		// int intBMI = (bmi>=25) ? 1 : (bmi < 18) ? -1 : 3; würde zum default-case führen
		
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
