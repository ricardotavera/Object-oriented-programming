package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class InterfazGrafica extends JFrame
{
	 public PanelPuntos  panel1,panel2;
	 public PanelResultado res;
	 public JButton calcular;
	 public  JLabel lbfondo;
	  
	public InterfazGrafica()
	  {
		
	     
	  panel1 = new PanelPuntos("Punto1","crear1","borrar1");
	  panel1.setBounds(0,0,495,120);
	  this.add(panel1);
	  
	  calcular = new JButton("Calcular");
	  calcular.setBounds(0,240,495,60);
	  calcular.setBackground(Color.GREEN);
	  calcular.setActionCommand("calcular");
	  calcular.setFont(new Font("Arial",Font.BOLD,32));
	  this.add(calcular);
	   
	 panel2 = new PanelPuntos("Punto2","crear2","borrar2");
	 panel2.setBounds(0,120,495,120);
	 this.add(panel2);
	 
	 res = new PanelResultado();
	 res.setBounds(0, 300, 495, 80);
	 this.add(res);
	 
	 ImageIcon fondo = new ImageIcon(getClass().getResource("linea.jpg"));
	 lbfondo = new JLabel(fondo);
     lbfondo.setBounds(0, 380, 500, 90);
     lbfondo.setVisible(false);
     this.add(lbfondo);
    

	   // Ajustar posición y dimensiones de la interfaz y hacerla viseble, tambie´n colocar el titulo de la pestaña
	    setLayout(null);
	    setResizable(false);
	    setSize(500,500);
	    setVisible(true);
	    setLocationRelativeTo(null);
	    setTitle("Puntos");
	    setDefaultCloseOperation(EXIT_ON_CLOSE); 
	    
	    
	    //Preguntar por que el layout(null) no se puede dejar aquí porque sale error
	    
	    
	  } 

	public void activarimagen()
	{
		lbfondo.setVisible(true);
	}
	

}
