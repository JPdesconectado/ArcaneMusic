package static_factory_singleton;

public class Perfil {
	private String nome;
	private String pacote;
	private double mensalidade;
	private static Perfil perfil;
	
	private Perfil(String nome, String pacote) {
		this.nome = nome;
		this.pacote = pacote;
		this.mensalidade = 0;
	}
	
	private Perfil(String nome, String pacote, double mensalidade) {
		this.nome = nome;
		this.pacote = pacote;
		this.mensalidade = mensalidade;
	}
	

	public static Perfil criaConta(String nome, String pacote) {
		if(perfil != null) {
			perfil.setNome(nome);
			perfil.setPacote(pacote);
			return perfil;
		}
		
		if (!validar(nome))
			return null;
		if (!validar(pacote))
			return null;
		return new Perfil(nome, pacote);
		
	}
	
	public static Perfil criarContaCompleta(String nome, String pacote, double mensalidade) {
		if(perfil != null) {
			perfil.setNome(nome);
			perfil.setPacote(pacote);
			perfil.setMensalidade(mensalidade);
			return perfil;
		}
		
		if (!validar(nome))
			return null;
		if (!validar(pacote))
			return null;
		if(!valorPositivo(mensalidade))
			return null;
		return new Perfil(nome, pacote, mensalidade);
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if (!validar(nome))
			return;
		this.nome = nome;
	}


	public String getPacote() {
		return pacote;
	}


	public void setPacote(String pacote) {
		if (!validar(pacote))
			return;
		this.pacote = pacote;
	}


	public double getMensalidade() {
		return mensalidade;
	}


	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	private static boolean validar(String texto) {
		return !texto.contains(" ");
	}
	
	private static boolean valorPositivo(double valor) {
		if (valor < 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
