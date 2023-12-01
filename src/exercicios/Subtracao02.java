package exercicios;

import java.util.Scanner;

public class Subtracao02 {

	public static void main(String[] args) {
		int numero01;
		int numero02;
		int subtracao;
		
		Scanner leia = new Scanner(System.in); 
			System.out.println("Digite um numero:");
			numero01 = leia.nextInt();
			
			System.out.println("Digite outro numero:");
			numero02 = leia.nextInt();
			
			subtracao = numero01 - numero02;
		
			System.out.printf("A subtracao de %d - %d é %d", numero01, numero02, subtracao);
		leia.close();
		
	}

}
