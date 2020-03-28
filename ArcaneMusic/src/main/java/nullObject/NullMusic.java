package nullObject;

public class NullMusic extends AbstractMusic{

	@Override
	public String getName() {
		return "Essa música não foi encontrada, por favor solicite a inserção dela para um admin.";
	}

}
