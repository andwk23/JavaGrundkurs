package de.andeuw23.bmi.controller;

import de.andeuw23.bmi.model.*;

public class BMIRechner {
	public double rechne(Lebewesen lebewesen) {
		double bmi = lebewesen.getGewicht()/(lebewesen.getGroesse() * lebewesen.getGroesse());
		return bmi;	
	}
}
