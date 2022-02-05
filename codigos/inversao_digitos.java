package codigos;

import java.util.Scanner;

public class inversao_digitos {

	public static void main (String args[]) {
	
		Scanner dados;
		dados = new Scanner(System.in);
		
		System.out.print("Número inteiro positivo:");
		int n = dados.nextInt();
		

		int invertido = 0;
		int d;

		while (n > 0) {
		    d = n % 10;
		    invertido = invertido * 10 + d;
		    n = Math.round(n / 10); 
		}

		System.out.print("Número invertido: " + invertido);
		
	}
}
