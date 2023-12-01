package exercicios;

public class SobrecargaDeMetodo {

	public static double doubleMetodoSoma(double num01, double num02) {
		return num01+num02;
	}
	
	public static int inteiroMetodoSoma(int num01, int num02) {
		return num01+num02;
	}
	//sobrecarga
	
	public static double MetodoSoma(double num01, double num02) {
		return num01+num02;
	}
	
	public static int MetodoSoma(int num01, int num02) {
		return num01+num02;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int somaInteiro = inteiroMetodoSoma(10, 10);
		double somaReal = doubleMetodoSoma(10.3, 10.3);
		System.out.println("inteiros:"+somaInteiro);
		System.out.println("reais:"+somaReal);
		
		System.out.println("------------");
		
		int somaInteiro2 = MetodoSoma(10, 10);
		double somaReal2 = MetodoSoma(10.3, 10.3);
		System.out.println("inteiros:"+somaInteiro2);
		System.out.println("reais:"+somaReal2);
	}

}
