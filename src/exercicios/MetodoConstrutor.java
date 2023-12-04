package exercicios;

public class MetodoConstrutor {

	int x;
	
	public MetodoConstrutor() {
		x=5;
	}
	
	public static void main(String[] args) {
		MetodoConstrutor obj01 = new MetodoConstrutor();
		System.out.println(obj01.x);
	}
}
