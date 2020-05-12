package ProxyDecorator;

public interface PlaylistDAOInterface {

	public void addPlaylist(String nome);
	
	public PlaylistDAO getPlaylist(String nome);
	
	public void removePlaylist(String nome);
	
}
