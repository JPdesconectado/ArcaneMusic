package composite;

public class TempoMusica implements TempoOuvindo{
	private String tempoInicio;
	private String tempoFinal;
	private int minutos;
	
	public TempoMusica(String tempoInicio, String tempoFinal) {
		super();
		this.tempoInicio = tempoInicio;
		this.tempoFinal = tempoFinal;
	}
	
	
	
	@Override
	public String getTempoInicio() {
		return tempoInicio;
	}
	@Override
	public String getTempoFinal() {
		return tempoFinal;
	}
	
	
	@Override
	public String toString() {
		return "[Inicio: " + tempoInicio + " minutos, Final: " + tempoFinal + " minutos]";
	}


	@Override
	public int getMinutosExecutando() {
		tempoInicio.split(":");
		minutos = Integer.parseInt(tempoInicio);
		return minutos;
	}

}
