package exercicios;

public class MetodoConstrutor02 {

	int x;
	
	public MetodoConstrutor02(int y) {
		x=y;
	}
	
	public static void main(String[] args) {
		MetodoConstrutor02 obj01 = new MetodoConstrutor02(100);
		
		System.out.println(obj01.x);
		
		
	}

}
