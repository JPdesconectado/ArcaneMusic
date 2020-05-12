package main;

import ProxyDecorator.PlaylistDAODecorator;
import ProxyDecorator.PlaylistDAOInterface;
import ProxyDecorator.PlaylistDAO;
import bridge.AppControl;
import bridge.DeviceInterface;
import chain_responsibility.BancoMaisTocadas;
import chain_responsibility.BancoPopulares;
import chain_responsibility.BancoRock;
import chain_responsibility.Musica;
import chain_responsibility.TrocarMusica;
import composite.TempoMusica;
import composite.TempoOuvindo;
import composite.TempoPlaylist;
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
		
	//chain_responsibility();
	proxy_decorator();
		
		
}
	
	
	
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
	
}

