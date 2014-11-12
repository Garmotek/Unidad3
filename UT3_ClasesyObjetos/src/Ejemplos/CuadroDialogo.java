package Ejemplos;

import javax.swing.JOptionPane;

public class CuadroDialogo {

	public static void main(String[] args) {
		
		//JOptionPane.showMessageDialog(null, "Hola Mundo!");
		
		//String nombre = "hola";
		
		//nombre = JOptionPane.showInputDialog("Dime tu nombre") ;
		
		//JOptionPane.showMessageDialog(null, "Hola " + nombre);
		
		String numero ;
		
		numero = JOptionPane.showInputDialog("Dime un numero") ;
		int n=Integer.parseInt(numero);
		
		Integer.toString(n);
		
	System.out.println(n);
		
	}

}
