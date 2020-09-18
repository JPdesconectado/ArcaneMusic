package double_dispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
	private List<Album> albuns;
	private Map<PropCarrinho, Double> props;
	
	
	public void addAlbum(Album album) {
		getAlbuns().add(album);
		album.addPropriedades(this);
	}
	
	private List<Album> getAlbuns() {
		if (albuns == null)
			albuns = new ArrayList<Album>();
		return albuns;
	}
	
	public double getTotal() {
		if (albuns.isEmpty())
			return 0.0;

		double total = 0;
		total += getPropriedades().get(PropCarrinho.PRECO);
		total += getPropriedades().get(PropCarrinho.APOIO_ARTISTA);
		
		return total;
	}
	
	public int getTempoAlugado() {
		return getPropriedades().get(PropCarrinho.TEMPO).intValue();
	}
	
	public void addPropriedade(PropCarrinho tipo, double valor) {
		getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
	}
	
	private Map<PropCarrinho, Double> getPropriedades() {
		if (props == null) {
			props = new HashMap<PropCarrinho, Double>();
			for (PropCarrinho tipo : PropCarrinho.values())
				props.put(tipo, 0.0);
		}
		return props;
	}
}
