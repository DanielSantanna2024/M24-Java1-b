package br.com.senaisp.bauru.daniel.licao07;

public class ClasseSingleton {
	private static ClasseSingleton instancia = null;
	private static int nSeqInstancia = 0;
	private int id;
	private String nome;
	//Constructor
	private ClasseSingleton() {
		id = ++nSeqInstancia;
		nome = null;
		
	}
	//Getters e Setters
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Métodos
	public ClasseSingleton getInstancia() {
		if ( instancia==null ) {
			instancia = new ClasseSingleton();
			
		}
		return instancia;
	}
}
