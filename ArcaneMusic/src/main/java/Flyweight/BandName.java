package Flyweight;

public class BandName implements MyString{
	private final String name;
	
	protected BandName (String name) {
		this.name = name;
	}
	
	public String getString() {
		return name;
	}
	
}
