package state;

public interface PlaylistState {

	PlaylistState reproduzindo();
	
	PlaylistState pausado();
	
	PlaylistState terminada();
}
