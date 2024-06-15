package br.com.senaisp.bauru.daniel.licao06;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] cinema = new String[10][10];
		//inicializando o cinema
		for (int i=0;i<cinema.length;i++) {//Fileiras
			for (int j=0;j<cinema[i].length;j++) {//Poltrona
				cinema[i][j] = "-";
				
			}
		}
		//Comprando os ingressos
		String term;
		do {
			for (int i=0;i<cinema.length;i++) {//Fileiras
				System.out.println("FL " + (i<9 ? " ": "") + (i+1));
			}
			for (int j=0;j<cinema[i].length;j++) {//Poltrona
				System.out.println(cinema[i][j] + " ");
			}
			System.out.println();
			System.out.println("Qual fileira você deseja?");
			int fl = sc.nextInt();
			System.out.println("Qual poltrona você deseja?");
			int po = sc.nextInt();
			//verificando se esta disponível
			try {
				if (cinema[fl-1][po-1].equals("-")) {
					cinema[fl-1][po-1] = "X";
				} else {
					System.out.println("Não disponível!");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Valor digitado é inválido!");
			}
			System.out.println("Deseja coninuar S/N?");
			sc.nextLine();//remover o enter
			term = sc.nextLine();
		} while(!term.equalsIgnoreCase("N"));
		sc.close();

	}

}
