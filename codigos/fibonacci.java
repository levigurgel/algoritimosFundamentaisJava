package codigos;

import java.util.Scanner;

public class fibonacci {
	
	public static void main (String args[]) {
		
		Scanner dados;
		dados = new Scanner(System.in);
		
		System.out.print("Número de termos: ");
		int n = dados.nextInt();

		int a = 0;
		int b = 1;
		int i = 2;
		int c;

		if (n == 1) {
			System.out.print(a);
		} else {
			System.out.print(a + ", " + b);
		}

		while (i < n) {
			i = i + 1;
		    c = a + b;
		    System.out.print(", " + c);
		    a = b;
		    b = c;
		}
			
	}

}
