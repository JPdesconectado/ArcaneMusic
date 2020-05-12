package chain_responsibility;

import java.util.HashMap;
import java.util.Map;

public class BancoRock extends TrocarMusica{
	private Map<String, Musica> banco = new HashMap<>();
	
	public BancoRock(TrocarMusica proxima) {
		super(proxima);
		banco.put("primeiro", new Musica("Pedra", "5 minutos"));
	}

	@Override
	protected Musica voltarMusica(String nome) {
		if(banco.containsKey(nome))
			return banco.get(nome);
		return null;
	}

}
