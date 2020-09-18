package fluent_interface;

public class Role {
	private String name;
	
	public Role func(String name) {
		this.name = name;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
