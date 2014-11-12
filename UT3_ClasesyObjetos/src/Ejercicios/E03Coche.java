package Ejercicios;

import Graphics.*; //Con asterico traemos todas las clases

public class E03Coche {


		public static void main(String[] args) throws InterruptedException {
			
			int puntoinicial,principio,rueda1,rueda2,anchorueda,principiorueda,alturacaja,anchuracaja;
			Rectangle caja;
			Ellipse rueda10,rueda20;
			
			
			puntoinicial = 50;
			principio = 500;
			alturacaja = (principio - ((principio/2) + (principio/4)));
			anchuracaja = principio;
			rueda1 = (puntoinicial+ ((principio/10)*2));
			rueda2 = (puntoinicial + ((principio/10)*8));
			anchorueda = (principio/7);
			principiorueda = (puntoinicial + alturacaja);
			
			caja= new Rectangle(puntoinicial,puntoinicial,anchuracaja,alturacaja);
			caja.draw();
			
			rueda10 = new Ellipse(rueda1,principiorueda,anchorueda,anchorueda);
			rueda10.setColor(Color.BLACK);
			rueda10.fill();
			
			rueda20 = new Ellipse(rueda2,principiorueda,anchorueda,anchorueda);
			rueda20.setColor(Color.BLACK);
			rueda20.fill();
			
			while(true)
			{	Thread.sleep(100);
				caja.translate(5, 0);
				rueda10.translate(5, 0);
				rueda20.translate(5, 0);
			}
		}
			
		}
