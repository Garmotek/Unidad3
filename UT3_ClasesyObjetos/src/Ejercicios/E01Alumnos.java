package Ejercicios;

import java.util.Scanner;

import Ejemplos.Alumno;

public class E01Alumnos {

	public static void main(String[] args) {
		Alumno alumno1,alumno2,alumno3;
		Scanner teclado = new Scanner(System.in);

		alumno1 = new Alumno();
		System.out.println("Nombre del primer alumno ");
		String nombre1 = teclado.nextLine();
		alumno1.setNombre(nombre1);
		
		System.out.println("Edad de los alumnos ");
		int edad = teclado.nextInt();
		alumno1.setEdad(edad);
		
		alumno2 = new Alumno();
		System.out.println("Nombre del segundo alumno ");
		String nombre2 = teclado.nextLine();
		alumno2.setEdad(edad);
		alumno2.setNombre(nombre2);
		
		alumno3 = new Alumno();
		System.out.println("Nombre del tercer alumno ");
		String nombre3 = teclado.nextLine();
		alumno3.setEdad(edad);
		alumno3.setNombre(nombre3);

		
		System.out.println("Listado de alumnos");
		System.out.println("alumno1 " + nombre1 );
		System.out.println("alumno2 "+ nombre2 );
		System.out.println("alumno3 "+ nombre3 );
		
	}	
}
