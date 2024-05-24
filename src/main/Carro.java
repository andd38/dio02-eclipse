package main;

public class Carro extends Veiculo{
	
	public void ligar() {
			confereCAmbio();
			confereCombustivel();
			System.out.println("carro ligado");
			
	}
	
	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}
	
	private void confereCAmbio() {
		System.out.println("conferindo cambio em P");
	}
	
	
}
