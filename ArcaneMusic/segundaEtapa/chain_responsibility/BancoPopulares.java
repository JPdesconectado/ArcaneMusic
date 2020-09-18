package chain_responsibility;

import java.util.HashMap;
import java.util.Map;

public class BancoPopulares extends TrocarMusica{
	private Map<String, Musica> banco = new HashMap<>();
	
	public BancoPopulares(TrocarMusica proxima) {
		super(proxima);
		banco.put("segundo", new Musica("Pipoca", "4 minutos"));
	}
	
	@Override
	protected Musica voltarMusica(String nome) {
		if(banco.containsKey(nome))
			return banco.get(nome);
		return null;
	}

}
