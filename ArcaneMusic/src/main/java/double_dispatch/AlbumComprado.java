package double_dispatch;

public class AlbumComprado extends Album{
	private double apoio_art;
	
	public AlbumComprado(double preco, double apoio_art) {
		super(preco);
		this.apoio_art = apoio_art;
	}
	
	
	@Override
	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropCarrinho.APOIO_ARTISTA, apoio_art);
	}

}
