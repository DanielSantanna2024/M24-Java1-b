package br.com.senaisp.bauru.daniel.licao05;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite seu nome completo: ");
			String nome = sc.nextLine();
			
			
			Scanner scA = new Scanner(nome);
			String primeiroNome="", ultimoNome="";
			while (scA.hasNext()) {
				if (primeiroNome.equals("")) {
					primeiroNome = ultimoNome;
				}
				
			}
			
		
		}

	}

}


