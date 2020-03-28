package state;

public class InicioPlaylist implements PlaylistState{

	public PlaylistState reproduzindo() {
		System.out.println("Playlist tocando");
		return new PlaylistTocando();
	}

	public PlaylistState pausado() {
		System.out.println("Playlist pausada");
		return new PlaylistPausada();
	}

	public PlaylistState terminada() {
		System.out.println("Playlist terminada");
		return new PlaylistTerminada();
	}

}
