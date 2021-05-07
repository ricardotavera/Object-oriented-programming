package GUI;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultado extends JPanel 
{   
	public JTextArea resultado;
	
	
	
    public PanelResultado() 
    {
    	
          resultado = new JTextArea();
    	  resultado.setBounds(5, 5, 150, 50);
    	  resultado.setEditable(false);
    	  JScrollPane scroll = new JScrollPane();
    	  scroll.setViewportView(resultado);
	      scroll.setBounds(10, 20,470, 50);
    	  this.add(scroll);
    	  
    	  
 		 this.setLayout(null);
 		 this.setBackground(Color.WHITE);
 		 TitledBorder borde = BorderFactory.createTitledBorder("Resultado");
 	     borde.setTitleColor(Color.BLUE);
 	     setBorder(borde);
          	
    	
    	
    }
    
    public void borrar()
    {
    	resultado.setText(" ");
    	
    }
    public void mostarDatos(String  pdatos)
    {
    	  resultado.append( pdatos + "\n");
    	  
    	  
    }
    
}
