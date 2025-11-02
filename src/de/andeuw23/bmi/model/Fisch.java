package de.andeuw23.bmi.model;

public class Fisch extends Lebewesen{
	
	public void isst() {
		super.gewicht += 0.001;
	}
	public void isst(double menge) {
		super.gewicht += menge/500;
	}
}
