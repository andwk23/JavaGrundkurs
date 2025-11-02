package de.andeuw23.bmi.controller;
import de.andeuw23.bmi.model.*;

public class BMIRechner {
	public static int counter;
	
	// Erzeugen einer Konstanten
	public static final double BMI_MAX = 25.0;
	public static final double BMI_MIN = 18.5;
	
	public double rechne(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht()/(lebewesen.getGroesse() * lebewesen.getGroesse());
		counter++;
		return bmi;
	}
		
	// Durch das Schlüsselwort static wird die Klassenmethode rechne1() erzeugt
	public static double rechne1(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht()/(lebewesen.getGroesse() * lebewesen.getGroesse());
		counter++;
		return bmi;	
	}
}
