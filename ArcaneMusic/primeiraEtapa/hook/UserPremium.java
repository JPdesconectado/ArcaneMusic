package hook;

public class UserPremium extends User{

	public UserPremium(String nome, int pacote) {
		super(nome, pacote);
	}

	@Override
	public double precoMensalidade() {
		switch(getPacote()) {
		case 1:
			return 0;
		
		case 2:
			return 16.90;
	
		case 3:
			return 8.50;
		
		default:
			return 0;
			
		}
	}





}
