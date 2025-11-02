package de.andeuw23.bmi.controller;

import de.andeuw23.bmi.model.Katze;

public class BMIRechner {
	public double rechne(Katze katze) {
		double bmi = katze.getGewicht()/(katze.getGroesse() * katze.getGroesse());
		return bmi;	
	}
}
