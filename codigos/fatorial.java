package codigos;

import java.util.Scanner;

public class fatorial {
	
	public static void main (String args[]) {
		
		Scanner dados; 
		dados = new Scanner(System.in);
		
		System.out.print("Número:");
		int n = dados.nextInt();
		int fator = 1;

		for (int i = 1; i <= n; i++) {
		    fator = i * fator;
		}

		System.out.print("Fatorial = " + fator);
		
	}

}
