package br.com.senaisp.bauru.daniel.licao07;

public abstract class Mamifero {
			//campos ou variáveis de instâncias ou fields
	public static void main(String[] args) {
		
	}
		private String nome;
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCor() {
			return cor;
		}
		public void setCor(String cor) {
			this.cor = cor;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		private String cor;
		private int idade;
		//constructor
		//getter e setters
		//métodos
		public void falar() {
			System.out.println("Mamifero falando");
		
	}
		@Override
		public String toString() {
			return "Nome: " + nome+ "\n"+ "Cor: "+ cor + "\n"+ "Idade: " + idade + "\n";
			
		}
		
		

}
