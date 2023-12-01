package exercicios;

import java.util.Scanner;

public class MetodoIdade {

	static void checarIdade(int idade) {
		if(idade<18) {
			System.out.println("Não pode acessar o site");
		}else {
			System.out.println("Pode acessar o site");
		}
	}
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
			System.out.println("Digite sua idade");
			int idade = leia.nextInt();
			checarIdade(idade);
		leia.close();
	}
}
