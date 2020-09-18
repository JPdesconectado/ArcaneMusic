package hook;

import strategy.ExibirBeneficioComum;
import strategy.ExibirBeneficioPremium;
import strategy.ExibirBeneficios;

public abstract class User {
	private String nome;
	private int pacote;
	protected ExibirBeneficios eb;
	
	public User(String nome, int pacote) {
		this.nome = nome;
		this.pacote = pacote;

		switch (pacote) {
		case 1:
			eb = new ExibirBeneficioComum();
			break;
		case 2:
			eb = new ExibirBeneficioPremium();
			break;
		case 3:
			eb = new ExibirBeneficioPremium();
			break;
		default:
			eb = new ExibirBeneficioComum();
			break;
		}
	}

	public String descobrirConta() {
		switch (pacote) {
		
		case 1:
			return "Conta Grátis";
			
		case 2:
			return "Conta Premium";

		case 3:
			return "Conta Universitária";

		default:
				return "Conta Grátis";
		}
	}

	public double precoAnualidade() {
		return precoMensalidade() * 12;
	}
	
	public abstract double precoMensalidade();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPacote() {
		return pacote;
	}
	
	public void setPacote(int pacote) {
		this.pacote = pacote;
	}
	
	public String exibirBeneficio() {
		return eb.ExibirBeneficioPacote(this);
	}
	


	
	
}
