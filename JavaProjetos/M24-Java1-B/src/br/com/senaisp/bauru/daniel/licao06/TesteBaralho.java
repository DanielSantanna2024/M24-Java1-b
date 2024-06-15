package br.com.senaisp.bauru.daniel.licao06;

public class TesteBaralho {

	public static void main(String[] args) {
		Baralho ba = new Baralho();
		Carta ct = ba.sortearCarta();
		System.out.println(ct.toString());

	}

}
