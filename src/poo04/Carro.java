package poo04;

public class Carro {

	public void aceleracaoMaxima() {
		System.out.println("O carro esta na velocidade maxima");
	}
	
	public void velocidadeMaxima(int velocidade) {
		System.out.println("A velocidade maxima é: " + velocidade);
	}
	
	public static void main(String[] args) {
		Carro carro01 = new Carro();
		carro01.aceleracaoMaxima();
		carro01.velocidadeMaxima(300);
	}

}
