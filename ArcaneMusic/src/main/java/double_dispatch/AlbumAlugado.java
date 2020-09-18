package double_dispatch;

public class AlbumAlugado extends Album{
	private double tempo;
	
	public AlbumAlugado(double preco, double tempo) {
		super(preco);
		this.tempo = tempo;
	}
	

	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropCarrinho.TEMPO, tempo);
	}
}
