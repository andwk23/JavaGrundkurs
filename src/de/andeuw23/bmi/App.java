package de.andeuw23.bmi;

import de.andeuw23.bmi.controller.*;
import de.andeuw23.bmi.model.*;

class App {

	public static void main(String[] args) {
		
		BMIRechner bmiRechner = new BMIRechner();				
		Katze[] katze = new  Katze[2];

		katze[0] = new Katze();
		katze[1] = new Katze();
		
		System.out.println("--- Objekte der Klasse 'Katze' ---");
		
		katze[0].name = "Minki";
		katze[0].groesse = 0.51;
		katze[0].gewicht = 6.0;
		System.out.printf("Name: %s", katze[0].name);
		System.out.printf("\nGewicht: %.2f", katze[0].gewicht);
		System.out.printf("\nGröße: %.2f", katze[0].groesse);
		
		double bmi = bmiRechner.rechne(katze[0].gewicht,katze[0].groesse);
		System.out.printf("\n\nDie Katze %s hat den BMI-Wert %.2f.", katze[0].name, bmi);
		
		katze[1].name = "Flo";
		katze[1].groesse = 0.48;
		katze[1].gewicht = 5.2;
		System.out.printf("\n\nName: %s", katze[1].name);
		System.out.printf("\nGewicht: %.2f", katze[1].gewicht);
		System.out.printf("\nGröße: %.2f", katze[1].groesse);
		
		bmi = bmiRechner.rechne(katze[1].gewicht,katze[1].groesse);
		System.out.printf("\nDie Katze %s hat den BMI-Wert %.2f.", katze[1].name, bmi);
	}

}
