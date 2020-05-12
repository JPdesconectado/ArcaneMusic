package ProxyDecorator;

import java.util.HashMap;
import java.util.Map;

public class PlaylistDAOProxy implements PlaylistDAOInterface {
	private Map<String, PlaylistDAO> playlist;
	
	public PlaylistDAOProxy() {
		this.playlist = new HashMap<>();
	}
	@Override
	public void addPlaylist(String nome) {
		this.playlist.put(nome, new PlaylistDAO(nome));
	
		
	}

	@Override
	public PlaylistDAO getPlaylist(String nome) {
		return playlist.get(nome);
	}
	@Override
	public void removePlaylist(String nome) {
		this.playlist.remove(nome);
	}

}
