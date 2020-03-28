package nullObject;

public class RealMusic extends AbstractMusic{

	public RealMusic(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return "Reproduzindo: " + name;
	}

}
