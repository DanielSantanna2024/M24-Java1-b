package br.com.senaisp.bauru.daniel.licao01;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);//.useLocale(Locale.ENGLISH)
		double galoes = 15;
		double litros = 0;
		double ga12lt = 3.785;
		//Solicitar a entrada via teclado pelo usuário
		System.out.println("Digite e quantidade de galões:");
		galoes = scn.nextDouble();
		//Importante fechar Scanner
		scn.close();
		//Fazendo as contas 
		litros = galoes * ga12lt;
		//Mostrar resultado
		System.out.println(galoes + " galoes equivalem a " +
						   litros + " litros");
			
	}

}
