package chain_responsibility;

public class Musica {
	private String nome;
	private String duracao;
	
	public Musica(String nome, String duracao) {
		super();
		this.nome = nome;
		this.duracao = duracao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
}
