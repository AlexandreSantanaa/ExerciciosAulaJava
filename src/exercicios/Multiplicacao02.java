package exercicios;

import java.util.Scanner;

public class Multiplicacao02 {

	public static void main(String[] args) {
		int numero01;
		int numero02;
		int multiplicacao;
		
		Scanner leia = new Scanner(System.in); 
			System.out.println("Digite um numero:");
			numero01 = leia.nextInt();
			
			System.out.println("Digite outro numero:");
			numero02 = leia.nextInt();
			
			multiplicacao = numero01 * numero02;
		
			System.out.printf("A multiplicacao de %d x %d é %d", numero01, numero02, multiplicacao);
		leia.close();
		
	}

}
