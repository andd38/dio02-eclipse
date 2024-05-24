package DesafioIphone.model;

import DesafioIphone.service.Navegadorservice;

public class OperaGX implements Navegadorservice{

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
