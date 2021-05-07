package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GUIProducto extends JPanel {
	
	public JButton bVender, bAbastecer;
	public JLabel nombreProducto,lbfondo,datos2,p2datos2,lbfoto;
	public JTextArea datos;
	public ImageIcon fondo,foto;
	private String cantMin="10";
    public String disponible;
    public JTextArea pdatos2;
	
	public GUIProducto(String nombre, String pfoto, String pVender, String pAbastecer)
	{
		  
		
	      bVender = new JButton("VENDER");
	      bVender.setBackground(Color.RED);
	      bVender.setForeground(Color.WHITE);
	      bVender.setBounds(160,240,120,30);
	      bVender.setActionCommand(pVender);
	      this.add(bVender);
			
	      bAbastecer = new JButton("ABASTECER");
	      bAbastecer.setBackground(Color.GREEN);
	      bAbastecer.setForeground(Color.BLACK);
	      bAbastecer.setBounds(20,240,120,30);
	      bAbastecer.setActionCommand(pAbastecer);	
	      this.add(bAbastecer);
		 
	      nombreProducto = new JLabel(nombre);
	      nombreProducto.setBounds(100, 5, 150, 40);
	      nombreProducto.setFont(new Font("Arial",Font.BOLD,20));
	      this.add(nombreProducto);
	      
	      datos = new JTextArea();
	      datos.setBounds(165, 50, 110, 100);
	      datos.setEditable(false);
	      datos.setFont(new Font ("Arial",Font.BOLD,13));
	      this.add(datos); 
	      
	      datos2 = new JLabel("Disponibles:                 CantMin:      " );
	      datos2.setBounds(30, 185, 250, 40);
	      datos2.setForeground(Color.WHITE);
	      datos2.setFont(new Font ("Arial",Font.BOLD,13));
	      this.add(datos2);
		  
	      pdatos2 = new JTextArea();
	      pdatos2.setBounds(115, 197, 40, 15);
	      pdatos2.setForeground(Color.BLACK);
	      pdatos2.setFont(new Font ("Arial",Font.BOLD,13));
	      pdatos2.setEditable(false);
	      this.add(pdatos2);
	      
	      p2datos2 = new JLabel(cantMin);
	      p2datos2.setBounds(250, 185, 250, 40);
	      p2datos2.setForeground(Color.RED);
	      p2datos2.setFont(new Font ("Arial",Font.BOLD,13));
	      this.add(p2datos2);
	      
	      foto = new ImageIcon(getClass().getResource(pfoto));
	      lbfoto = new JLabel(foto);
	      lbfoto.setBounds(10, 40, 132, 125);  
	      this.add(lbfoto);
	     
	      
	      fondo = new ImageIcon(getClass().getResource("fondo.png"));
	      lbfondo = new JLabel(fondo);
	      lbfondo.setBounds(0, 20, 300, 239);
	      
	      this.add(lbfondo);
	      
	      
		 this.setLayout(null);
		 this.setBackground(Color.WHITE);
		 TitledBorder borde = BorderFactory.createTitledBorder("");
	     borde.setTitleColor(Color.BLUE);
	     setBorder(borde);
	      
	}

	

	public void mostarDatos(String pdatos)
    {
    	  datos.append( pdatos + "\n");
    	  
    	  
    }
	public void mostarBodega(String pdatos)
    {
    	  pdatos2.append( pdatos + "\n");
    	  
    	  
    }
   
	public void borrar()
	{
		pdatos2.setText(" ");
	}
    public void BtsAcciones(ActionListener pAL)
    {
        bVender.addActionListener(pAL);
        bAbastecer.addActionListener(pAL);
        
    }
	


		
	  
}

