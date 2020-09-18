package double_dispatch;

public class Album {
	private double preco;
	
	public Album(double preco) {
		super();
		this.preco = preco;
	}
	
	public void addPropriedades(Carrinho carrinho) {
		carrinho.addPropriedade(PropCarrinho.PRECO, preco);
	}
}
