package exercicios;

public class ExRecursividade {

	
	public static void main(String[] args) {
		int resultado = soma(5);
		System.out.println("O valor da recursão é: " + resultado);
	}
	
	static int soma(int parametro) {
		return (parametro>0)?parametro*soma(parametro-1):1;
	}
}
