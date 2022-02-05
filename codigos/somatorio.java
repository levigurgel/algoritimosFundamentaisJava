package codigos;

import java.util.Scanner;

public class somatorio {
	
	public static void main (String args[]) {
		
		Scanner dados;
		dados = new Scanner(System.in);
		
		System.out.print("Quantidade de números: ");
		int n = dados.nextInt();
		int soma = 0;
		int i = 0;

		while (i < n) {
		    i = i + 1;
		    System.out.print("Números: ");
		    int numero = dados.nextInt();
		    soma = soma + numero;
		}

		System.out.print("Soma = " + soma);
		
		
	}

}
