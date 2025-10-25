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
		
		katze[0].setName("Minki");
		katze[0].setGroesse(0.51);
		katze[0].setGewicht(6.0);
		System.out.printf("Name: %s", katze[0].getName());
		System.out.printf("\nGewicht: %.2f", katze[0].getGewicht());
		System.out.printf("\nGröße: %.2f", katze[0].getGroesse());
		
		double bmi = bmiRechner.rechne(katze[0]);
		System.out.printf("\n\nDie Katze %s hat den BMI-Wert %.2f.", katze[0].getName(), bmi);
		
		katze[1].setName("Flo");
		katze[1].setGroesse(0.48);
		katze[1].setGewicht(5.2);
		System.out.printf("\n\nName: %s", katze[1].getName());
		System.out.printf("\nGewicht: %.2f", katze[1].getGewicht());
		System.out.printf("\nGröße: %.2f", katze[1].getGroesse());
		
		bmi = bmiRechner.rechne(katze[1]);
		System.out.printf("\nDie Katze %s hat den BMI-Wert %.2f.", katze[1].getName(), bmi);
	}

}
