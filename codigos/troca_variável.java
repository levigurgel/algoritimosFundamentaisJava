package codigos;

import java.util.Scanner;

public class troca_vari�vel {
	
	public static void main (String args[]){
		
			Scanner dado;
			dado = new Scanner(System.in);
			
			System.out.print("Valor da vari�vel A:");
			int a = dado.nextInt();
			System.out.print("Valor da vari�vel B:");
			int b = dado.nextInt();
			int aux;

			aux = a;
			a = b;
			b = aux;

			System.out.println("Novo valor da vari�vel A: " + a);
			System.out.println("Novo valor da vari�vel B: " + b);
		
	 }
}
