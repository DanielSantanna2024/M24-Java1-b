package br.com.senaisp.bauru.daniel.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.senaisp.bauru.daniel.licao07.Utils;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vlr01, vlr02, vlr03;
		//garantindo a entrada do primeiro valor
		do {
				System.out.println("Digite o primeiro valor:");
			
			try {
				vlr01 = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor deve ser inteiro!");
				sc.nextLine(); //captura do enter
				vlr01 = 0;
				e.printStackTrace();
			}
		}while(vlr01<=0);
		vlr02 = Utils.lerInteiro(sc, "Digite o segundo número", vlr01, vlr02, Integer.MAX_VALUE);
		System.out.println("Resultado: " +vlr03);
		sc.close();
	}

} 
