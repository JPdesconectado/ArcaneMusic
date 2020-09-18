package state;

public class PlaylistPausada implements PlaylistState{

	public PlaylistState reproduzindo() {
		System.out.println("Reproduzindo.");
		return new PlaylistTocando();
	}

	public PlaylistState pausado() {
		System.out.println("A playlist já está parada.");
		return this;
	}

	public PlaylistState terminada() {
		System.out.println("Fim da Playlist.");
		return new PlaylistTerminada();
	}

}
