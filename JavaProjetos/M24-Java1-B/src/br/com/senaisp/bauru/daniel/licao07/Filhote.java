package br.com.senaisp.bauru.daniel.licao07;

public class Filhote {
	private static int nSeq = 0;
	private int id;
	public int getId() {
		return id;
	}
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//constructor
	public Filhote (String nome) {
		id = ++nSeq;
		this.nome = nome;
		
	}
	//Getters e Setters
	
}
