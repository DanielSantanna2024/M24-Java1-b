package br.com.senaisp.bauru.daniel.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um valor:");
			int vl01 = sc.nextInt();
			System.out.println("Digite outro valor:");
			int vl02 = sc.nextInt();
			//calculando
			int vl03 = vl01 / vl02;
			System.out.println("Resultado: " + vl03);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu uma divisão por zero!");
			
			
			
			e.printStackTrace();
		} catch(InputMismatchException e) {
			System.out.println("Digite um número inteiro!");
		}
		
		
		
		
		sc.close();

	}

}
