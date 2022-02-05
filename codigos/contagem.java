package codigos;

import java.util.Scanner;

public class contagem {
	
	public static void main (String args[]) {
		
		Scanner dados;
		dados = new Scanner(System.in);
		
		System.out.print("Número de notas: ");
		int n = dados.nextInt();
		int nota;
		int contagem = 0;
		int i = 0;

		while (i < n) {
		    i = i + 1;
		    
		    System.out.print("Nota do aluno: ");
		    nota = dados.nextInt();

		    if (nota >= 50) {
		        contagem = contagem + 1;
		    }
		}

		System.out.print("Número de aprovações: " + contagem);
		
	}

}
