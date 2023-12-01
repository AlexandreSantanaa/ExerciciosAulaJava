package exercicios;

import java.util.Scanner;

public class Soma2 {

	public static void main(String[] args) {
		int numero01;
		int numero02;
		int soma;
		
		Scanner leia = new Scanner(System.in); 
			System.out.println("Digite um numero:");
			numero01 = leia.nextInt();
			
			System.out.println("Digite outro numero:");
			numero02 = leia.nextInt();
			
			soma = numero01 + numero02;
		
			System.out.printf("A soma de %d + %d é %d", numero01, numero02, soma);
		leia.close();
		
	}

}
