package chain_responsibility;

import java.util.HashMap;
import java.util.Map;

public class BancoMaisTocadas extends TrocarMusica{
	private Map<String, Musica> banco = new HashMap<>();
	
	public BancoMaisTocadas(TrocarMusica proxima) {
		super(proxima);
		banco.put("terceiro", new Musica("Musica Muito Boa", "3 minutos"));
	}
	
	@Override
	protected Musica voltarMusica(String nome) {
		if(banco.containsKey(nome))
			return banco.get(nome);
		return null;
	}

}
