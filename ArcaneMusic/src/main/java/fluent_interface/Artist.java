package fluent_interface;

public class Artist {

	private String name;
	private String registerDate;
	private Role role;
	
	public Artist named(String name) {
		this.name = name;
		return this;
	}
	
	public Artist registerOn(String registerDate) {
		this.registerDate = registerDate;
		return this;
	}
	
	public Artist is(Role role) {
		this.role = role;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
