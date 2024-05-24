package DesafioIphone.model;

import DesafioIphone.service.Reprodutorservice;

public class spotify implements Reprodutorservice {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando musica no spotify");
		
	}

	@Override
	public void Pausar() {
		// TODO Auto-generated method stub
		System.out.println("Pausando musica no spotify");
		
	}

	@Override
	public void SelecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Selecionando musica no Spotify");
		
	}

}
