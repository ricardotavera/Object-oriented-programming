package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import cerebro.Carro;
import vista.InterfazGrafica;

public class Controlador  implements ActionListener
{  
	//Atributos de case 
	
	private Carro carro;
	private InterfazGrafica interfazGrafica;
   
	//Constructor de clase
	
	public Controlador (Carro pCarro, InterfazGrafica pInterfazGrafica)
	{
		
		carro = pCarro;
		interfazGrafica = pInterfazGrafica;
		interfazGrafica.boton1.addActionListener(this);
		interfazGrafica.boton2.addActionListener(this);
		interfazGrafica.boton3.addActionListener(this);
		interfazGrafica.boton4.addActionListener(this);
		interfazGrafica.botoncolor.addActionListener(this);
		
		
		
			
		
	}
     
	
	//Aplicar acciones segun el comando 
	
	public void actionPerformed(ActionEvent ae) 
	{
		String comando = ae.getActionCommand();
		
		if(comando.equals("crear"))
		{
		
			try {
			String color = interfazGrafica.getColor();
			double px = Double.parseDouble(interfazGrafica.getposicionx());
			double py = Double.parseDouble(interfazGrafica.getposiciony());
			
			//CReación de Carro
			carro = new Carro(color,"Daniel",px,py);
			
			//Hallar datos e imprimirlos usando el modelo e InterfazG...
			
			interfazGrafica.mostrarcreado();
			interfazGrafica.mostarDatos("Auto de marca: "+carro.getnombre());
			interfazGrafica.mostarDatos("Color: "+carro.getcolor());
			interfazGrafica.mostarDatos("Nro ruedas: "+carro.getruedas());
			interfazGrafica.mostarDatos("Posicion X: "+carro.getpx()+" metros");
			interfazGrafica.mostarDatos("Posición Y: "+carro.getpy()+" metros");
			interfazGrafica.mostarDatos("Velocidad: "+carro.getvel()+" m/s ");
			interfazGrafica.mostarDatos("Aceleración: "+carro.getace()+" m/s^2"+ "\n");
			
			
			//Desactivar creado
			interfazGrafica.desactivarBotonCrear();
			
			//Activar botones de manejo
			interfazGrafica.activarBotones();
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Datos mal ingresados","Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		  if(comando.equals("acelerar"))
		  {
			  
			  interfazGrafica.mostarDatos("EL auto ha acelerado, ahora tiene: "+carro.acelerar()+" m/s" +"\n");
			  
		  }
		  
		  if(comando.equals("frenar"))
		  {
			  interfazGrafica.mostarDatos("El auto ha frenado, ahora tiene: "+carro.fenar()+" m/s"+"\n");
			  
		  }
			
		  if(comando.equals("mover"))
		  {
			  double nuevox = Double.parseDouble(interfazGrafica.getnuevaposicionx());
			  double nuevoy = Double.parseDouble(interfazGrafica.getnuevaposiciony());
			  
			  carro.mover(nuevox, nuevoy);
			  
			  interfazGrafica.mostarDatos("La nueva posicion X: "+carro.getpx()+" metros");
			  interfazGrafica.mostarDatos("La nueva posición Y: "+carro.getpy()+" metros"+ "\n");
			  
			  interfazGrafica.borrar();
		  }
			
		  if(comando.equals("color"))
		  {
			  String color = interfazGrafica.getnuevocolor();
			  carro.setcolor(color);
			  interfazGrafica.mostarDatos("El color ha sido cambiado a: "+carro.getcolor()+"\n");
			  
			  interfazGrafica.borrarcolor();
			  
		  }
		}
	
	
	 

}
