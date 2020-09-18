package Facade;

public class StylePicker {

	private Style rock;
	private Style pop;
	private Style funk;
	
	public StylePicker() {
		rock = new Rock();
		pop = new Pop();
		funk = new Funk();
	}
	
	public void pickRock() {
		rock.pick();
	}
	
	public void pickFunk() {
		funk.pick();
	}
	
	public void pickPop() {
		pop.pick();
	}
}
