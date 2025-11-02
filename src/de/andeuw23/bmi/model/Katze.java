package de.andeuw23.bmi.model;

public class Katze extends Lebewesen{
	private Ball ball;

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
