package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import GUI.InterfazGrafica;
import modelo.PlanoCartesiano;
import modelo.Punto;

public class Controlador implements ActionListener
{   
	//===================================0Atributos
	
	private PlanoCartesiano plano;
	private Punto punto;
	private Punto punto2;
	private InterfazGrafica gui;
	
	public Controlador(InterfazGrafica pinterfaz,Punto ppunto1, Punto papunto2,PlanoCartesiano pplano)
	{
		this.gui = pinterfaz;
		this.punto = ppunto1;
		this.punto2 = papunto2;	
		this.plano = pplano;
		this.gui.panel1.Activarbotones(this);
		this.gui.panel2.Activarbotones(this);
		this.gui.calcular.addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand();
		
		
		
		if(comando.equals("crear1"))
		{
			try {
	    	double x1 = Double.parseDouble(gui.panel1.gettfx());
			double y1 = Double.parseDouble(gui.panel1.gettfy());
			 
			punto = new Punto(x1,y1);
			
			JOptionPane.showMessageDialog(null, "El punto se ha creado exitosamente"," Exelente",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(Exception o)
			{
				
				if(gui.panel1.gettfx().isEmpty() || gui.panel1.gettfy().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
				}
				else {
				JOptionPane.showMessageDialog(null, "Error en la entrada de datos"," Wrong",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		if(comando.equals("borrar1"))
		{
			
			gui.panel1.borrar();
			
			
		}
		if(comando.equals("crear2"))
		{
			try {
	    	double x1 = Double.parseDouble(gui.panel2.gettfx());
			double y1 = Double.parseDouble(gui.panel2.gettfy());
			 
			punto2 = new Punto(x1,y1);
			
			JOptionPane.showMessageDialog(null, "El punto se ha creado exitosamente","Exelente ",JOptionPane.INFORMATION_MESSAGE);
			}
			catch(Exception o)
			{
				if(gui.panel1.gettfx().isEmpty() || gui.panel1.gettfy().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos");
				}
				else
				{
				JOptionPane.showMessageDialog(null, "Error en la entrada de datos"," Wrong",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		if(comando.equals("borrar2"))
		{
			
			gui.panel2.borrar();
			
		}
		
		if(comando.equals("calcular"))
	   { 
		try 
		{
			plano = new PlanoCartesiano(punto,punto2);	
		    gui.res.mostarDatos("\n"+"La distancia entre puntos es: "+plano.calculardistancia());	
		    gui.activarimagen();
		}
		catch(Exception o)
		{
			
			JOptionPane.showMessageDialog(null, "Error en la entrada de datos"," Wrong",JOptionPane.ERROR_MESSAGE);
		}
	  
	   }
		
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/* 

	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String command= ae.getActionCommand();
		
	  if(command.contentEquals("crear1"))
	  {
		  try
		  {   
			  double x = Double.parseDouble(gui.panel1.gettfx());
			  double y = Double.parseDouble(gui.panel1.gettfy());
			 
			  Punto punto1 = new Punto(x,y);
			  
		  }
		  catch(Exception o)
		  {
			  JOptionPane.showMessageDialog(null, "Error en la introducción de datos","Wrong",JOptionPane.ERROR_MESSAGE);
			   
		  }
		if(command.contentEquals("crear2"))
		{
			
			
			try
			{
				
				double x = Double.parseDouble(gui.panel2.gettfx());
				double y = Double.parseDouble(gui.panel2.gettfy());
				 
				  Punto punto2 = new Punto(x,y);
			}
			catch(Exception o)
			{
				JOptionPane.showMessageDialog(null, "Error en la introducción de datos","Wrong",JOptionPane.ERROR_MESSAGE);
				
			}
			
		}
		  
		  
		  
	  }
		
	
		
	}
   
}
 
	*/