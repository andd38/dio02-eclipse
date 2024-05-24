package DesafioIphone.model;

import DesafioIphone.service.Reprodutorservice;

public class Googleplaymusic implements Reprodutorservice {

	@Override
	public void tocar() {
		System.out.println("Tocando musica com Google play music");
		
	}

	@Override
	public void Pausar() {
		System.out.println("Pausando musica no Google play music");
		
	}

	@Override
	public void SelecionarMusica() {
		System.out.println("Selecionando musica no playMusic");
		
	}

}
