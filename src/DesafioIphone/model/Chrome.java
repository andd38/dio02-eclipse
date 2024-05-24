package DesafioIphone.model;

import DesafioIphone.service.Navegadorservice;

public class Chrome implements Navegadorservice {

	@Override
	public void ExibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("Exibindo pagina no Chrome");
		
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adcionando nova aba no chrome");
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando Pagina no chrome");
		
	}
	

}
