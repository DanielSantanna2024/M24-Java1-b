package br.com.senaisp.bauru.daniel.licao05;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		System.out.println("Digite seu nome:");
		sc.nextLine(); //para capturar enter numérico
		String nome = sc.nextLine();
		System.out.println("Digite sua cidade:");
		String cidade = sc.next();
		//mostrando dados
		System.out.println("Nome: " + nome +
							"\nIdade: " + idade +
							 "\nCi==Cidade: " + cidade);
		sc.close();

	}

}
