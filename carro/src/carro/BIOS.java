package carro;


import cerebro.Carro;
import controlador.Controlador;
import vista.InterfazGrafica;

public class BIOS {

	 public static void main(String [] args)
	 {   
		 
		 InterfazGrafica in = new InterfazGrafica();
		 Carro carro = null;
		 Controlador modelo = new Controlador(carro,in);
		 
		 
	    /* Carro c1 = new Carro("Rojo", "Campero", 19.4, 13.4); 
	     
	     c1.setnombre("Hummer");
	     
	     
		 System.out.println("Los datos del carro se muestran a continuación");
		 System.out.println("Nombre: "+c1.getnombre());
		 System.out.println("Color: "+c1.getcolor());
		 System.out.println("Posición X: "+c1.getpx());
		 System.out.println("Posición Y: "+c1.getpy());
		 System.out.println(c1.acelerar());
		 System.out.println(c1.acelerar());
		 System.out.println(c1.fenar());
		 System.out.println(c1.getace());    */
		 
		
	 
	 }
	
	
}