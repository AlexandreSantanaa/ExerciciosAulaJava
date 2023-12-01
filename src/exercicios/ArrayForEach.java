package exercicios;

public class ArrayForEach {

	public static void main(String[] args) {
		String[] carros = {"carro00", "carro01", "carro02"};
		
		for(String i : carros) {
			System.out.println(i);
		}
		
		for(int i =0; i<carros.length; i++) {
			System.out.println(carros[i]);
		}
	}

}
