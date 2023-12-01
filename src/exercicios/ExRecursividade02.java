package exercicios;

public class ExRecursividade02 {
	
	
	
	public static void main(String[] args) {
		int result = sum(5,10);
		System.out.println(result);
	}
	
	public static int sum(int comeco, int fim) {
		return(fim > comeco)?fim+sum(comeco, fim-1):fim;
	}
}
