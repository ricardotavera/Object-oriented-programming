package GUI;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Scrollbar;

import javax.swing.*;


public class GUI extends JFrame
{    
	    public GUIProducto GUIproducto1,GUIproducto2,GUIproducto3,GUIproducto4;
	    public GUIMostrarDatos GUIcambios,GUIEstadisticas;
	       
	    public GUI() {
	       
	       GUIproducto1 = new GUIProducto("Aerogel","aerogel.png","vender1","abastecer1");
		   GUIproducto2 = new GUIProducto("Cuaderno","cuaderno.jpg","vender2","abastecer2");
		   GUIcambios = new GUIMostrarDatos("Actividad");
		   JScrollPane scroll = new JScrollPane();
		   scroll.setViewportView(GUIcambios);
			 
		   GUIproducto3 = new GUIProducto("Mantequilla","mantequilla.jpg","vender3","abastecer3");
		   GUIproducto4 = new GUIProducto("Alcohol","alcohol.jpg","vender4","abastecer4");
		   GUIEstadisticas = new GUIMostrarDatos("Estadisticas");
		   
		   this.add(GUIproducto1);
		   this.add(GUIproducto2);
		   this.add(scroll);
		   this.add(GUIproducto3);
		   this.add(GUIproducto4);
		   this.add(GUIEstadisticas);
		   
		   this.setSize(900,600);
		   this.setVisible(true);
		   this.setLayout(new GridLayout(2,3));
		   this.setLocationRelativeTo(null);
		   this.setBackground(Color.blue);
	       this.setTitle("La Tienda");   
		   this.setDefaultCloseOperation(EXIT_ON_CLOSE);   
		
		  
	           }
	    

}
