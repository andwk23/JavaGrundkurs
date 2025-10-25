package de.andeuw23.bmi.controller;

public class BMIRechner {
	public double rechne(double gewicht, double groesse) {
		double bmi = gewicht/(groesse * groesse);
		return bmi;	
	}
}
