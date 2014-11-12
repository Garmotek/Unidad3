package Ejercicios;

import Graphics.*; //Con asterico traemos todas las clases

public class E02Semaforo {


	public static void main(String[] args) {
		
		int ancho,alto,anchodisco;
		Rectangle caja;
		Ellipse rojo,ambar,verde;
		Rectangle poste;
		
		ancho = 75; //Todo el tamaño del semaforo esta basado en este valor
		alto = ancho * 3;
		anchodisco = (int)(ancho*0.8);
		
		caja= new Rectangle(0,0,ancho,alto);
		caja.draw();
		
		rojo = new Ellipse(ancho/2 - anchodisco/2, alto/6 - anchodisco/2, anchodisco, anchodisco );
		rojo.setColor(Color.RED);
		rojo.fill();
		
		ambar = new Ellipse(ancho/2 - anchodisco/2, (alto/6)*3 - anchodisco/2, anchodisco, anchodisco );
		ambar.setColor(Color.ORANGE);
		ambar.fill();
		
		verde = new Ellipse(ancho/2 - anchodisco/2, (alto/6)*5 - anchodisco/2, anchodisco, anchodisco );
		verde.setColor(Color.GREEN);
		verde.fill();
				
		poste = new Rectangle(ancho/3, alto, ancho/3, alto*2);
		poste.draw();
	}
}
