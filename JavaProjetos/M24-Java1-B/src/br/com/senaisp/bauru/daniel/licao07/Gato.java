package br.com.senaisp.bauru.daniel.licao07;

public class Gato extends Mamifero {
	private boolean quadrupede;
//Getters e Setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//Métodos
	@Override
	public void falar() {
		
		super.falar();
		System.out.println("Miau Miau");
	}
}
