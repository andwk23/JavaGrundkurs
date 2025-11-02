package de.andeuw23.bmi.model;

public class Katze extends Lebewesen{
	private Ball ball;
	
	// Defaultkonstruktor
	public Katze() {
		// Besonderheiten der Vaterklasse durch super() aufrufen
		super();
		System.out.println("\n--- Die Katze wurde mit dem Defaultkonstruktor erstellt. ---");
	}
	
	// Konstruktor, der Name, Gewicht und Größe verlangt
	public Katze(String name, double gewicht, double groesse) {
		// Besonderheiten der Vaterklasse durch super() aufrufen
		super();
		super.setName(name);
		super.setGewicht(gewicht);
		super.setGroesse(groesse);
		System.out.printf("\n--- Die Katze %s wurde mit parametrisiertem Konstruktor erstellt. ---\n", super.getName());
	}

	// Destruktor
	public void finalize() {
		System.out.println("\n\t--- Die Katze wurde entfernt! ---");
	}
	
	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
	
	public void isst() {
		super.gewicht += 0.1;
	}
	public void isst(double menge) {
		super.gewicht += menge/5;
	}
	public void spielt() {
		super.gewicht -= 0.1;
	}
}
