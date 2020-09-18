package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class NameFactory {
	private static Map<String, BandName> names;
	
	
	private static void init() {
		names = new HashMap<String, BandName>();
		names.put("Guns n' Roses", new BandName("Guns n' Roses"));
		names.put("AC/DC", new BandName("AC/DC"));
		names.put("Dragonforce", new BandName("Dragonforce"));
	}
	
	public static BandName get(String s) {
		if (names == null)
			init();
		
		return names.get(s);
	}
}
