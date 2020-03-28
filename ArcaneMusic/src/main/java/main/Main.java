package main;

import java.util.Scanner;

import bridge.AppControl;
import bridge.DeviceInterface;
import bridge.DeviceMobile;
import bridge.DevicePC;
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
		Scanner teclado = new Scanner(System.in);
		boolean redo = true;
		
		while(redo) {
		System.out.println("---- Menu Interessante de Padrões de Projeto ----");	
		System.out.println();
		System.out.println("--- 1 > Strategy Method ----");	
		System.out.println("--- 2 > NullObject Method ----");
		System.out.println("--- 3 >  Hook Method ----");
		System.out.println("--- 4 > Bridge Method ----");
		System.out.println("--- 5 > State Method ----");
		System.out.println("--- 6 > Observer Method ----");
		System.out.println("--- 7 > Fechar Programa ----");
		System.out.print("Escolha: ");
		int i = teclado.nextInt();
		System.out.println();

		switch(i) {
		
		case 1:
			strategy();
			break;
			
		case 2:
			nullObject();
			break;
			
		case 3:
			hook();
			break;
			
		case 4:
			bridge(new DevicePC());
			bridge(new DeviceMobile());
			break;
			
		case 5:
			state();
			break;
			
		case 6:
			observer();
			break;
			
		case 7:
			redo = false;
			System.out.println("Saindo.");
			teclado.close();
			break;
			
		default:
				System.out.println("Invalido.");
				break;
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		}
	}
	
	
	
public static void strategy() {
	User free = new UserNormal("Joãozinho", 1);
	System.out.println("Benefícios de " 	+ free.getNome() + " -> " + free.exibirBeneficio());
	User premium = new UserPremium("Josézinho", 2);
	
	System.out.println("Benefícios de " + premium.getNome() + " -> " + premium.exibirBeneficio());
}

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
	
public static void hook() {
	User Free = new UserNormal("Joãozinho", 1);
	User Premium = new UserPremium("Josézinho", 3);
	System.out.println("O usuário " 	+ Free.getNome() + " Possui uma " + Free.descobrirConta() + ". Valor da Anualidade: R$" + Free.precoAnualidade());
	System.out.println("O usuário " 	+ Premium.getNome() + " Possui uma " + Premium.descobrirConta() + ". Valor da Anualidade: R$" + Premium.precoAnualidade());
}
		
public static void bridge(DeviceInterface device) {
		AppControl app = new AppControl(device);
		app.chanceMusic("Sweet Child O' Mine");
		device.printStatus();
		app.volumeDown();
		app.chanceMusic("Patience");
		device.printStatus();
}
	
public static void state() {
	Playlist playlist = new Playlist();	
	playlist.reproduzindo();
	playlist.pausado();
	playlist.terminada();
}

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

		am.notify("Ouça a nova música lançada exclusivamente em nossa plataforma!");
}




}

