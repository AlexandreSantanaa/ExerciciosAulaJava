package exercicios;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
			System.out.println("Digite sua idade:");
			int idade = leia.nextInt();
			
			String resposta = (idade<16)?"Não pode votar":(idade<18)?"Voto opcional":"Voto obrigatorio";
			
			
			System.out.println(resposta);
	leia.close();

	}

}
