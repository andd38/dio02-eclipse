package DesafioIphone.model;

import DesafioIphone.service.Telefoneservice;

public class Contato implements Telefoneservice{

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("Ligando para alguém");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo o telefone");
	}

	@Override
	public void iniciarCorrerideVoz() {
		// TODO Auto-generated method stub
		System.out.println("Enviando mensagem de voz");
	}
	
}
