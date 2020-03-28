package hook;

public class UserNormal extends User{

	public UserNormal(String nome, int pacote) {
		super(nome, pacote);
	}

	@Override
	public double precoMensalidade() {
		return 0;
	}








}
