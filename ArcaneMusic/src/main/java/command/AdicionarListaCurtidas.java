package command;

public class AdicionarListaCurtidas implements Comando{

	private String listaMusica;
	private String curtir;
	
	public AdicionarListaCurtidas (String listaMusica, String curtir) {
		super();
		this.listaMusica = listaMusica;
		this.curtir = curtir;
	}


	public String curtir() {
		return listaMusica.concat(curtir + "\n" );
	}

	public String descurtir() {
		return listaMusica;
	}

}
