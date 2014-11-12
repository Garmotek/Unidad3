package Ejercicios;

import java.util.Scanner;	

public class E04Mayorde3 {
			
		 public static void main(String[] args){
			 
		      Scanner teclado = new Scanner(System.in);
		      int 	numero1, numero2, numero3;
		      System.out.print("Introduzca primer número: ");
		      numero1 = teclado.nextInt();
		    System.out.print("Introduzca segundo número: ");
		      numero2 = teclado.nextInt();
		      System.out.print("Introduzca tercer número: ");
		        numero3 = teclado.nextInt();
		        
		        if	(numero1 > numero2)
		           if	(numero1>numero3)
		              System.out.println("El número mayor es: " + numero1);
		           else
		              System.out.println("El número mayor es: " + numero3);
		        else 
		        	if	(numero2>numero3)
		              System.out.println("El número mayor es: " + numero2);
		            else
		              System.out.println("El número mayor es: " + numero3);
		    }
		}