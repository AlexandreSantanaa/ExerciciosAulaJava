package poo02;

public class MostrarComputador {

	public static void main(String[] args) {
		Computador pc01 = new Computador();
		
		System.out.println("A marca do pc " + pc01.marca);
		System.out.println("A modelo do pc " + pc01.modelo);
		System.out.println("A cor do pc " + pc01.cor);
		System.out.println("A preco do pc " + pc01.preco);
	}
}
