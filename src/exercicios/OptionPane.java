package exercicios;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPane {
	Jframe f;
	
	OptionPane(){
		f=new JFrame();  
	    JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
	}
	
	public static void main(String[] args) {
		new OptionPane();
	}

}
