package br.com.senaisp.bauru.daniel.licao02;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//Mostrando a msg para o usuário
		System.out.println("Digite seu nome completo");
		nome = scn.nextLine();
		//vamos separar nome e sobrenome
		String primNome = nome.substring(0,(nome+" ").indexOf(" "));
		//pegar o último sobrenome
		String lastName = nome.substring(nome.lastIndexOf(" "));
		//mostrando o nome
		System.out.println(primNome);
		System.out.println(primNome);
		
		
		//Fechando Scanner
		scn.close();
	}

}
