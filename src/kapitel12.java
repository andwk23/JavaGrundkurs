
class kapitel12 {

	public static void main(String[] args) {
		Katze meineKatze = new Katze();
		
		// Ausgabe der Eigenschaften einer Katze mit vorinitierten Werten
		System.out.println("\nVordefinierte Werte der Eigenschaften der Klasse Katze");
		System.out.printf("\nName: %s", meineKatze.name);
		System.out.printf("\nGewicht: %.2f", meineKatze.gewicht);
		System.out.printf("\nGröße: %.2f\n", meineKatze.groesse);
		
		System.out.println("-----------------------------------------------");
		
		//Initierubg der Eigenschaften der Katze 'meineKatze'
		System.out.println("\nNach Initierung der Eigenschaften von meineKatze");
		meineKatze.name = "Minki";
		meineKatze.groesse = 0.51;
		meineKatze.gewicht = 6.0;
		System.out.printf("\nName: %s", meineKatze.name);
		System.out.printf("\nGewicht: %.2f", meineKatze.gewicht);
		System.out.printf("\nGröße: %.2f", meineKatze.groesse);
		
		// Zugriff auf die Methode BMIRechner
		System.out.println("\n-----------------------------------------------");
		BMIRechner bmiRechner = new BMIRechner();
		double bmi = bmiRechner.rechne(meineKatze.gewicht,meineKatze.groesse);
		System.out.printf("\nDie Katze %s hat den BMI-Wert %.2f.", meineKatze.name, bmi);
	}

}
