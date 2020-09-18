package nullObject;

public class MusicDAO {

	public static final String[] nomes = { "Sweet Child O' Mine", "Paradise City", "November Rain", "Patience", "Don't Cry" };
	
	public static AbstractMusic getMusic(String nome) {
		for (int i = 0; i < nomes.length; i++) 
			if (nomes[i].equalsIgnoreCase(nome)) 
				return new RealMusic(nome);			
		
		return new NullMusic();
	}
}
