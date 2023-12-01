package exercicios;

public class MetodoPassagemParametro02 {

	static void mensagem(String nome, String sobrenome) {
		System.out.println(nome + " " + sobrenome);
	}
	
	public static void main(String[] args) {
		mensagem("Alexandre", "Lemes");
		mensagem("Xande", "Santana");
	}

}
