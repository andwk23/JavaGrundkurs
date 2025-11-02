package de.andeuw23.bmi;

import de.andeuw23.bmi.controller.*;
import de.andeuw23.bmi.model.*;

class App {

	public static void main(String[] args) {
		
		BMIRechner bmiRechner = new BMIRechner();				
		Lebewesen[] lebewesen = new  Lebewesen[3];
		Double[] gewicht = new Double[3];

		lebewesen[0] = new Katze();
		lebewesen[1] = new Katze();
		lebewesen[2] = new Fisch();
		
		System.out.println("--- Objekte der Klasse 'Katze' ---");
		
		lebewesen[0].setName("Minki");
		lebewesen[0].setGroesse(0.51);
		lebewesen[0].setGewicht(6.0);
		gewicht[0] = lebewesen[0].getGewicht();
		System.out.printf("Name: %s", lebewesen[0].getName());
		System.out.printf("\nGewicht: %.2f", lebewesen[0].getGewicht());
		System.out.printf("\nGröße: %.2f", lebewesen[0].getGroesse());
		
		double bmi = bmiRechner.rechne(lebewesen[0]);
		System.out.printf("\nDie Katze %s hat den BMI-Wert %.2f.", lebewesen[0].getName(), bmi);
		
		System.out.println("\n-----------------------------------------------------------");
		
		lebewesen[0].isst();
		lebewesen[0].isst();
		lebewesen[0].isst();
				
		lebewesen[1].setName("Flo");
		lebewesen[1].setGroesse(0.48);
		lebewesen[1].setGewicht(5.2);
		gewicht[1] = lebewesen[1].getGewicht();
		System.out.printf("Name: %s", lebewesen[1].getName());
		System.out.printf("\nGewicht: %.2f", lebewesen[1].getGewicht());
		System.out.printf("\nGröße: %.2f", lebewesen[1].getGroesse());
		
		bmi = bmiRechner.rechne(lebewesen[1]);
		System.out.printf("\nDie Katze %s hat den BMI-Wert %.2f.", lebewesen[1].getName(), bmi);
		
		lebewesen[1].isst();
		lebewesen[1].isst();
		lebewesen[1].isst();
		((Katze)lebewesen[1]).spielt(); // lebewesen[1] wird zu einer Katze gecasted
		
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("\n--- Gewicht nach 3 Mahlzeiten ---");
		System.out.printf("Name: %s", lebewesen[0].getName());
		System.out.printf("\nGewicht vor den Mahlzeiten: %.2f\nGewicht nach den Mahzeiten: %.2f", gewicht[0], lebewesen[0].getGewicht());
		
		System.out.println("\n\n--- Gewicht nach 3 Mahlzeiten und einmal Spielen ---");
		System.out.printf("Name: %s", lebewesen[1].getName());
		System.out.printf("\nGewicht vor den Mahlzeiten und dem Spielen: %.2f"
				+ "\nGewicht nach den Mahzeiten und dem Spielen: %.2f", gewicht[1], lebewesen[1].getGewicht());
		
		System.out.println("\n\n--- Objekte der Klasse 'Fisch' ---");
		
		lebewesen[2].setName("Peter");
		lebewesen[2].setGroesse(0.01);
		lebewesen[2].setGewicht(0.005);
		gewicht[2] = lebewesen[2].getGewicht();
		System.out.printf("Name: %s", lebewesen[2].getName());
		System.out.printf("\nGewicht: %.4f", lebewesen[2].getGewicht());
		System.out.printf("\nGröße: %.4f", lebewesen[2].getGroesse());
		
		bmiRechner.rechne(lebewesen[2]);
		System.out.printf("\nDer Fisch %s hat den BMI-Wert %.2f.", lebewesen[2].getName(), bmi);
		
		System.out.println("\n-----------------------------------------------------------");
		
		lebewesen[2].isst();
		lebewesen[2].isst();
		
		System.out.println("\n--- Gewicht nach 2 Mahlzeiten ---");
		System.out.printf("Name: %s", lebewesen[2].getName());
		System.out.printf("\nGewicht vor den Mahlzeiten: %.4f"
				+ "\nGewicht nach den Mahzeiten: %.4f\n", gewicht[2], lebewesen[2].getGewicht());				
	}
	
	

}
