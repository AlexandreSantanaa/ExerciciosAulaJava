package exercicios;

public class JavaShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //Para números positivos, >> e >>> funcionam da mesma forma  
	    System.out.println( 20 >> 2 );  
	    System.out.println( 20 >>> 2 );  
	    //Para número negativo, >>> altera o bit de paridade (MSB) para 0  
	    System.out.println(- 20 >> 2 );  
	    System.out.println(- 20 >>> 2 );  
	}

}
