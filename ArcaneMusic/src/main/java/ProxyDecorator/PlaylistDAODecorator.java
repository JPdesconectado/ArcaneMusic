package ProxyDecorator;

public class PlaylistDAODecorator implements PlaylistDAOInterface{
	private static PlaylistDAOInterface playlistDAO;
	
	private PlaylistDAOInterface getDAO() {
		if (playlistDAO == null)
			playlistDAO = new PlaylistDAOProxy();
		return playlistDAO;
	}
	
	@Override
	public void addPlaylist(String nome) {
		if(nome.isBlank())
			throw new RuntimeException("O nome não pode estar em branco.");
		getDAO().addPlaylist(nome);
	}

	@Override
	public PlaylistDAO getPlaylist(String nome) {
		if(nome.isBlank())
			throw new RuntimeException("O nome não pode estar em branco.");
		PlaylistDAO p = getDAO().getPlaylist(nome);
		if (p == null)
			throw new RuntimeException("O nome precisa ser válido");
		return p;
	}

	@Override
	public void removePlaylist(String nome) {
		getDAO().removePlaylist(nome);
		
	}

}
