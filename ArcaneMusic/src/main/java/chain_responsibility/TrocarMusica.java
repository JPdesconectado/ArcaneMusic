package chain_responsibility;

public abstract class TrocarMusica {
	private TrocarMusica proxima;
	
	
	public TrocarMusica(TrocarMusica proxima) {
		this.proxima = proxima;
	}
	
	public Musica voltar(String nome) {
		Musica m = voltarMusica(nome);
		if(m == null) {
			return passarMusica(nome);
		}else {
			return m;
		}
	}
	
	private Musica passarMusica(String nome) {
		if(proxima == null)
			throw new RuntimeException("Música não encontrada.");
		return proxima.voltar(nome);
	}
	
	protected abstract Musica voltarMusica(String nome);

}
