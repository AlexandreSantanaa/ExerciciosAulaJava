package poo03;

public class ExemploEstatico {
	
	public static void mensagem() {
		System.out.println("mostra01");
	}
	
	public void mensagem02() {
		System.out.println("mostra02");
	}
	
	
	public static int soma(int num01, int num02) {
		return num01+num02;
	}
	
	public int subtracao(int num01, int num02) {
		return num01-num02;
	}
		
	public static void main(String[] args) {
		ExemploEstatico msg = new ExemploEstatico();

		mensagem();
		
		msg.mensagem02();
		
		System.out.println(soma(1,2));
		
		System.out.println(msg.subtracao(1,2));
		
				
	}
}
