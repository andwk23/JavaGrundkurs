
class kapitel12 {

	public static void main(String[] args) {
		Katze[] katze = new  Katze[2];
		
		// Katze meineKatze = new Katze();
		katze[0] = new Katze();
		katze[1] = new Katze();
		
		// Ausgabe der Eigenschaften einer Katze mit vorinitierten Werten
		System.out.println("\nVordefinierte Werte der Eigenschaften der Klasse Katze");
		System.out.printf("Name: %s", katze[0].name);
		System.out.printf("\nGewicht: %.2f", katze[0].gewicht);
		System.out.printf("\nGröße: %.2f\n", katze[0].groesse);
		
		System.out.println("\n-----------------------------------------------");
		
		//Initierubg der Eigenschaften der Katze 'katze[0]'
		System.out.println("Nach Initierung der Eigenschaften von katze[0]");
		katze[0].name = "Minki";
		katze[0].groesse = 0.51;
		katze[0].gewicht = 6.0;
		System.out.printf("Name: %s", katze[0].name);
		System.out.printf("\nGewicht: %.2f", katze[0].gewicht);
		System.out.printf("\nGröße: %.2f", katze[0].groesse);
		
		//Initierubg der Eigenschaften der Katze 'katze[1]'
				System.out.println("\nNach Initierung der Eigenschaften von katze[1]");
				katze[1].name = "Flo";
				katze[1].groesse = 0.48;
				katze[1].gewicht = 5.2;
				System.out.printf("Name: %s", katze[1].name);
				System.out.printf("\nGewicht: %.2f", katze[1].gewicht);
				System.out.printf("\nGröße: %.2f", katze[1].groesse);
		
		// Zugriff auf die Methode BMIRechner
		System.out.println("\n-----------------------------------------------");
		BMIRechner bmiRechner = new BMIRechner();
		double bmi = bmiRechner.rechne(katze[0].gewicht,katze[0].groesse);
		System.out.println("\n--- Zugriff byValue ---");
		System.out.printf("Die Katze %s hat den BMI-Wert %.2f.", katze[0].name, bmi);
		
		System.out.println("\n-----------------------------------------------");
		bmi = bmiRechner.rechne(katze[1].gewicht,katze[1].groesse);
		System.out.println("\n--- Zugriff byValue ---");
		System.out.printf("Die Katze %s hat den BMI-Wert %.2f.", katze[0].name, bmi);
		
		// Zugriff auf die Methode BMIRechnerByReference
		System.out.println("\n-----------------------------------------------");
		BMIRechnerByReference bmiRechnerByReference = new BMIRechnerByReference();
		System.out.println("\n--- Zugriff byReference für katze[0]---");
		double bmiByReference = bmiRechnerByReference.rechne(katze[0]);
		System.out.printf("Die Katze %s hat den BMI-Wert %.2f.", katze[0].name, bmiByReference);
	}

}
