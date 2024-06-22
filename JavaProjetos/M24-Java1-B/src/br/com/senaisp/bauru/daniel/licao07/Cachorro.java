package br.com.senaisp.bauru.daniel.licao07;

public class Cachorro extends Mamifero{
	private boolean quadrupede;
	//constructor
	//getters e setters
	public boolean isQuadrupede() {
		return quadrupede;
	}

	public void setQuadrupede(boolean quadrupede) {
		this.quadrupede = quadrupede;
	}
	//métodos
	public void falar() {
		System.out.println("AU AU AU AU");
	}
	@Override
	public String toString() {
		return super.toString()+ "Quadrupede: " + quadrupede+ "\n";
	}
}
