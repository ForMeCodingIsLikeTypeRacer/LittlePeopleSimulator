
public class Cultures {
	public double birthrate = 1;
	public double attackpower = 1;
	public double defense = 1;
	public double intelligence = 1;
	public double discipline = 1;
	public double health = 100;
	public String special1;
	
	Cultures(){}
	
	Cultures(double newbirthrate, double newattackpower, double newdefense, double newintelligence, 
			double newdiscipline, double newhealth, String newspecial1) {
		birthrate = newbirthrate;
		attackpower = newattackpower;
		defense = newdefense;
		intelligence = newintelligence;
		discipline = newdiscipline;
		health = newhealth;
		special1 = newspecial1;
	}
}
