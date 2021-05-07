package GUI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class GUIMostrarDatos extends JPanel 
{    
	public JTextArea datos;
   
	public GUIMostrarDatos(String nombre)
	{
		 datos = new JTextArea("\n");
		 datos.setEditable(false);
		 //datos.setForeground(Color.BLACK);
		 JScrollPane scroll = new JScrollPane();
		 
		 datos.setBounds(5, 5, 250, 200);
		 this.add(datos);
		
		 this.setBackground(Color.WHITE);
		 TitledBorder borde = BorderFactory.createTitledBorder(nombre);
	     borde.setTitleColor(Color.BLACK);
	     setBorder(borde);
	     
	     
	}
	  
	public void mostarDatos(String pdatos)
	    {
	    	  datos.append( pdatos + "\n");
	    	  	  
	    }
	public void borrar()
	{
		
		datos.setText(" ");
		
	}
}
