package state;

public class PlaylistTocando implements PlaylistState{

	public PlaylistState reproduzindo() {
		System.out.println("M�sica j� est� em reprodu��o.");
		return this;
	}

	public PlaylistState pausado() {
		System.out.println("M�sica Pausada.");
		return new PlaylistPausada();
	}

	public PlaylistState terminada() {
		System.out.println("Fim da Playlist.");
		return new PlaylistTerminada();
	}

}
