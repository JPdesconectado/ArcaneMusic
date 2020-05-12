package composite;

public class TempoPlaylist implements TempoOuvindo{
	private TempoOuvindo primeiraMusica;
	private TempoOuvindo segundaMusica;
	private int minutos;
	
	public TempoPlaylist(TempoOuvindo primeiraMusica, TempoOuvindo segundaMusica) {
		super();
		this.primeiraMusica = primeiraMusica;
		this.segundaMusica = segundaMusica;
	}
	
	@Override
	public String getTempoInicio() {
		return primeiraMusica.getTempoInicio();
	}
	@Override
	public String getTempoFinal() {
		return segundaMusica.getTempoFinal();
	}
	
	@Override
	public String toString() {
		return primeiraMusica.toString() + "\n" + segundaMusica.toString();
	}

	@Override
	public int getMinutosExecutando() {
		int primeiro;
		int segundo;
		String[] tempoSegundo = segundaMusica.getTempoFinal().split(":");
		String[] tempoPrimeiro = primeiraMusica.getTempoInicio().split(":");
		segundo = Integer.parseInt(tempoSegundo[0]);
		
		primeiro = Integer.parseInt(tempoPrimeiro[0]);
		minutos = segundo - primeiro;
		return minutos;
	}
	
}
