package DesafioIphone.model;

import DesafioIphone.service.Navegadorservice;
import DesafioIphone.service.Reprodutorservice;
import DesafioIphone.service.Telefoneservice;

public class Celular implements Navegadorservice, Reprodutorservice, Telefoneservice {

	@Override
	public void ligar() {
		System.out.println("Ligando para alguém");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo o telefone");
	}

	@Override
	public void iniciarCorrerideVoz() {
		System.out.println("Enviando mensagem de voz");
		
	}

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

	@Override
	public void ExibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo pagina no OperaGX");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adcionando nova aba no OperaGX");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando Pagina no OperaGX");
	}
	
	
	

}
