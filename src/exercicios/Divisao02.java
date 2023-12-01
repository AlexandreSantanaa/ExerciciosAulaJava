package exercicios;

import java.util.Scanner;

public class Divisao02 {

	public static void main(String[] args) {
		float numero01;
		float numero02;
		float divisao;
		
		Scanner leia = new Scanner(System.in); 
			System.out.println("Digite um numero:");
			numero01 = leia.nextFloat();
			
			System.out.println("Digite outro numero:");
			numero02 = leia.nextFloat();
			
			divisao = numero01 / numero02;
		
			System.out.printf("A divisao de %.2f / %.2f é %.2f", numero01, numero02, divisao);
		leia.close();
		
	}

}
