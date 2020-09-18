package main;

import ProxyDecorator.PlaylistDAODecorator;
import ProxyDecorator.PlaylistDAOInterface;
import Facade.StylePicker;
import Flyweight.MusicList;
import Flyweight.NameFactory;
import ProxyDecorator.PlaylistDAO;
import bridge.AppControl;
import bridge.DeviceInterface;
import chain_responsibility.BancoMaisTocadas;
import chain_responsibility.BancoPopulares;
import chain_responsibility.BancoRock;
import chain_responsibility.Musica;
import chain_responsibility.TrocarMusica;
import command.AdicionarListaCurtidas;
import command.ExecutarComandos;
import composite.TempoMusica;
import composite.TempoOuvindo;
import composite.TempoPlaylist;
import double_dispatch.AlbumAlugado;
import double_dispatch.AlbumComprado;
import double_dispatch.Carrinho;
import fluent_interface.Artist;
import fluent_interface.Role;
import hook.User;
import hook.UserNormal;
import hook.UserPremium;
import nullObject.AbstractMusic;
import nullObject.MusicDAO;
import observer.Device;
import observer.Service;
import state.Playlist;

public class Main {
	public static void main(String[] args) {
		//fluent_interface();
		 //command();
		 //double_dispatch();
		// facade();
		 flyweight();
}
	// ---------------------------------------------- //
	
	// Parte Final

	public static void fluent_interface() {
		Role cantor = new Role().func("Cantor");
		Artist Drake = new Artist().named("Drake").registerOn("06/08/2020").is(cantor);
		System.out.println("Nome do Artista: " + Drake.getName() + ", Registrado em: " + Drake.getRegisterDate() + 
				", Tipo de Artista: " + Drake.getRole().getName());
	}

	public static void command() {
		String lista = "";
		ExecutarComandos exec = new ExecutarComandos();
		
		lista = exec.curtir(new AdicionarListaCurtidas(lista, "Sweet Child O' Mine"));
		System.out.println("1 - " + lista);
		
		lista = exec.curtir(new AdicionarListaCurtidas(lista, "Welcome to The Jungle"));
		System.out.println("2 - " + lista);
		
		lista = exec.descurtir();
		System.out.println("3 - " + lista);
		
		lista = exec.recurtir();
		System.out.println("4 - " + lista);
		
	}

	public static void double_dispatch() {
		AlbumComprado ac1 = new AlbumComprado(100, 15);
		AlbumComprado ac2 = new AlbumComprado(125, 37);
		AlbumAlugado al1 = new AlbumAlugado(25, 30);
		
		Carrinho c = new Carrinho();
		c.addAlbum(ac1);
		c.addAlbum(ac2);
		c.addAlbum(al1);
		
		System.out.println("Valor Total: R$ " + c.getTotal());
		System.out.println("Album alugado por " + c.getTempoAlugado() + " dias.");
		
		
	}

	public static void facade() {
		StylePicker sp = new StylePicker();
		sp.pickRock();
		sp.pickPop();
		sp.pickFunk();
	}

	public static void flyweight() {
		MusicList ml = new MusicList();
		ml.add(NameFactory.get("AC/DC"));
		ml.add(NameFactory.get("Dragonforce"));
		System.out.println(ml.getString());
		
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ---------------------------------------------- //
	
	
	// Parte 1
	// Ver benef�cios de diferentes contas
	public static void strategy() {
		User free = new UserNormal("Jo�ozinho", 1);
		System.out.println("Benef�cios de " 	+ free.getNome() + " -> " + free.exibirBeneficio());
		User premium = new UserPremium("Jos�zinho", 2);
		
		System.out.println("Benef�cios de " + premium.getNome() + " -> " + premium.exibirBeneficio());
	}
	// Checar m�sicas
	public static void nullObject() {
		AbstractMusic music1 = MusicDAO.getMusic("Sweet Child O' Mine");
		AbstractMusic music2 = MusicDAO.getMusic("Don't Cry");
		AbstractMusic music3 = MusicDAO.getMusic("Patience");
		AbstractMusic music4 = MusicDAO.getMusic("Welcome to The Jungle");
		System.out.println("Musics:");
		System.out.println(music1.getName());
		System.out.println(music2.getName());
		System.out.println(music3.getName());
		System.out.println(music4.getName());
	}	
	// Ver tipo de conta
	public static void hook() {
		User free = new UserNormal("Jo�ozinho", 1);
		User premium = new UserPremium("Jos�zinho", 3);
		System.out.println("O usu�rio " 	+ free.getNome() + " Possui uma " + free.descobrirConta() + ". Valor da Anualidade: R$" + free.precoAnualidade());
		System.out.println("O usu�rio " 	+ premium.getNome() + " Possui uma " + premium.descobrirConta() + ". Valor da Anualidade: R$" + premium.precoAnualidade());
	}		
	// Fazer diferencia��o entre dispositivos
	public static void bridge(DeviceInterface device) {
			AppControl app = new AppControl(device);
			app.chanceMusic("Sweet Child O' Mine");
			device.printStatus();
			app.volumeDown();
			app.chanceMusic("Patience");
			device.printStatus();
	}	
	// Checar o momento atual da playlist
	public static void state() {
		Playlist playlist = new Playlist();	
		playlist.reproduzindo();
		playlist.pausado();
		playlist.terminada();
	}
	// Notificar os usu�rios das novidades
	public static void observer() {
		Service am = new Service("Arcane Music");
		Device samsung = new Device("Samsung Galaxy");
		Device iphone = new Device("iPhone X");
		Device dell = new Device("Dell");
		Device alienware = new Device("Alienware");
		
		am.addObserver(samsung);
		am.addObserver(iphone);
		am.addObserver(dell);
		am.addObserver(alienware);

		am.notify("Ou�a a nova m�sica lan�ada exclusivamente em nossa plataforma!");
}
	// ---------------------------------------------- //	
	// Parte 2
	// Calcular tempo que o usu�rio est� ouvindo m�sica
	public static void composite() {
		TempoOuvindo musicaA = new TempoMusica("00:00", "03:30");
		TempoOuvindo musicaB = new TempoMusica("03:30", "05:35");
		TempoOuvindo playlist = new TempoPlaylist(musicaA, musicaB);
		System.out.println(playlist);
		System.out.println("Minutos Ouvindo: " + playlist.getMinutosExecutando() + " minutos.");
	}
	// Busca a m�sica solicitada dentro dos banco de dados do aplicativo, caso n�o ache, vai dar erro. (Chain Responsibility)
	public static void chain_responsibility() {
		TrocarMusica musicas = new BancoMaisTocadas(new BancoRock(new BancoPopulares(null)));
		Musica m = musicas.voltar("primeiro");
		System.out.println("Musica atual: " + m.getNome() + " Tempo de M�sica: " + m.getDuracao());
		m = musicas.voltar("quarta");
		System.out.println("Musica atual: " + m.getNome() + " Tempo de M�sica: " + m.getDuracao());
	}	
	// Cria e remove playlists (Proxy e Decorator)
	public static void proxy_decorator() {
		PlaylistDAOInterface playlistDAO = new PlaylistDAODecorator();
		playlistDAO.addPlaylist("S� os Rock Puto");
		PlaylistDAO play = playlistDAO.getPlaylist("S� os Rock Puto");
		System.out.println(play.getNome());
		playlistDAO.removePlaylist("S� os Rock Puto");
		System.out.println(playlistDAO.getPlaylist("S� os Rock Puto"));
		
	}
	// ---------------------------------------------- //
	
}
