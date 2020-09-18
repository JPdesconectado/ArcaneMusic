package state;

public class PlaylistTocando implements PlaylistState{

	public PlaylistState reproduzindo() {
		System.out.println("Música já está em reprodução.");
		return this;
	}

	public PlaylistState pausado() {
		System.out.println("Música Pausada.");
		return new PlaylistPausada();
	}

	public PlaylistState terminada() {
		System.out.println("Fim da Playlist.");
		return new PlaylistTerminada();
	}

}
