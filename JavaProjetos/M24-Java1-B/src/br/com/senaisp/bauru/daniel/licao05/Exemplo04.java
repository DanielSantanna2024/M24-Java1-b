package br.com.senaisp.bauru.daniel.licao05;

import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String linha = "";
		//ler os dadods de uma linha
		Scanner sc = new Scanner(Exemplo04.class.getResourceAsStream("dados.cvs"));
		String linha = sc.nextLine();
		Scanner scA = new Scanner(linha);
		scA.useDelimiter(";");
		while (scA.hasNext()) {
			System.out.println(scA.next() + "\t\t");
		}

		scA.close();
		//percorrendo os itens do arquivo
		while (sc.hasNext()) {
			linha = sc.nextLine();
			scA = new Scanner(linha);
			scA.useDelimiter(";");
			while (scA.hasNext()) {
				System.out.println(scA.next()+"\t"); //pulando a linha
			}
			System.out.println();
			scA.close();
		}
	
	}

}
