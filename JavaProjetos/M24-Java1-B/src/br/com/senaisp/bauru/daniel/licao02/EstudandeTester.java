package br.com.senaisp.bauru.daniel.licao02;

public class EstudandeTester {

	public static void main(String[] args) {
		// TODO terminar o código
		Estudante est01 = new Estudante();
		est01.setNome("Daniel");
		est01.setId(1);
		est01.setMedia(8.5f);
		//Mostrando valores
		System.out.println("Nome: " + est01.getNome());
		System.out.println("Documento " + est01.getDocumento());
		//obtendo o objeto como representação textual
		System.out.println(est01.toString());
		//criando um novo esudante
		Estudante est02 = new Estudante(2, "Róbiçu", "12345678", 9.6f, 1600.00, false);
		//mostrando o estudante
		System.out.println(est02.toString());
	}

}
