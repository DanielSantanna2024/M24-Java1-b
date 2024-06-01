package br.com.senaisp.bauru.daniel.licao05;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o operando 1:");
		int vlr1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a operação: ");
		String operação = sc.nextLine();
		System.out.println("Digite o operando 2:");
		int vlr2 = sc.nextInt();
		//verificando as operções
		int valor = 0;
		if (operacao.equals("+")) {
			valor = vlr1 + vlr2;
		} 
		  else if (operacao.equals("-")) {
			  valor = vlr1 - vlr2;
		} 
		  else if (operacao.equals("/")) {
			  valor = vlr1 / vlr2;
			} 
		  else if (operacao.equals("*")) {
			  valor = vlr1 * vlr2;
			} 
		
	}

}
