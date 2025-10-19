
public class BMIRechnerByReference {
	double rechne(Katze katze) {
		katze.gewicht += 1.5;
		double bmi = katze.gewicht/(katze.groesse * katze.groesse);
		return bmi;				
	}
}
