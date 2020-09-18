package state;

public class Playlist {
	protected PlaylistState state;
	
	
	public Playlist() {
		state = new InicioPlaylist();
	}
	
	public void reproduzindo() {
		state = state.reproduzindo();
	}
	
	public void pausado() {
		state = state.pausado();
	}
	
	public void terminada() {
		state = state.terminada();
	}
	
}
