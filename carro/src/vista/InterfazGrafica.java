package vista;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.TitledBorder;




public class InterfazGrafica extends JFrame 
{
	
	//Atributos del JFrame
				
  private JPanel panel1,panel2,panel3;
  private JLabel label1,label2,label3,label4,label5,label6,textocreado;
  private JTextField text1,text2,text3,text4,text5,text6;
  private JLabel lbImagenDatos,lbImagenPanel2,lbImagen2,lbfotocarro;
  private ImageIcon imagenDatos,imagenPanel2,iBoton,fotocarro,imagencolor;
  public JButton boton1,boton2,boton3,boton4,botoncolor;
  private TitledBorder borde1,borde2,borde3;
  private JTextArea actividad;
 
 
  
 //Metodos
        
     
		  
		public InterfazGrafica()
		  {
			
			
			//Creación de panel y sus componentes
		    //===============================================
		    panel1 = new JPanel();
			panel1.setBackground(Color.WHITE);
			panel1.setSize(500,200);
			panel1.setLocation(0,0);
			panel1.setLayout(null);
		    borde1 = BorderFactory.createTitledBorder("Datos de creación");
	        borde1.setTitleColor(Color.BLUE);
	        panel1.setBorder(borde1);
	        add(panel1);
	         
	        label2 = new JLabel("Color");
			label2.setBounds(50,50+10,70,10);
			panel1.add(label2);
		    
			label3 = new JLabel("Posición X");
			label3.setBounds(50,80+10,70,10);
			panel1.add(label3);
			
			label4 = new JLabel("Posición Y");
			label4.setBounds(50,110+10,70,10);
			panel1.add(label4);
			
			text1 = new JTextField("Rojo");
			text1.setBounds(140,45+10,70,20);
			panel1.add(text1);
			
			text2 = new JTextField("34");
			text2.setBounds(140,75+10,70,20);
			panel1.add(text2);
			
			text3 = new JTextField("26.9");
			text3.setBounds(140,105+10,70,20);
			panel1.add(text3);
			
			
			
			//Nombre
			
			boton1 = new JButton("CREAR");
			boton1.setBackground(Color.RED);
			boton1.setForeground(Color.WHITE);
			boton1.setActionCommand("crear");
			boton1.setBounds(300,70,90,50);
			panel1.add(boton1);
			
		  
			
			imagenDatos = new ImageIcon(getClass().getResource("fondodatos.png"));
	        lbImagenDatos = new JLabel(imagenDatos);
	        lbImagenDatos.setBounds(5,20,490,170);
	        lbImagenDatos.setLayout(null);
	        panel1.add(lbImagenDatos);
	        
	       
			//Panel 2 y sus componentes
	        //==============================================000
	     
	        panel2 = new JPanel();
	        panel2.setBackground(Color.WHITE);
	        panel2.setBounds(0, 200, 500, 260);
	        panel2.setLayout(null);
	        borde2 = BorderFactory.createTitledBorder("Manejar");
	        borde2.setTitleColor(Color.BLUE);
	        panel2.setBorder(borde2);
	        add(panel2);
	        
	        
	        label5 = new JLabel("Nuevo Color");
	        label5.setForeground(Color.WHITE);
			label5.setBounds(50,50+10,70,10);
			panel2.add(label5);
		    
			label6 = new JLabel("Nuevo X ");
			label6.setForeground(Color.WHITE);
			label6.setBounds(50,80+10,70,10);
			panel2.add(label6);
			
			label6 = new JLabel("Nuevo Y");
			label6.setForeground(Color.WHITE);
			label6.setBounds(50,110+10,70,10);
			panel2.add(label6);
			
			text4 = new JTextField("");
			text4.setBounds(140,45+10,70,20);
			text4.setEnabled(false);
			panel2.add(text4);
			
			text5 = new JTextField("");
			text5.setBounds(140,75+10,70,20);
			text5.setEnabled(false);
			panel2.add(text5);
			
			text6 = new JTextField("");
			text6.setBounds(140,105+10,70,20);
			text6.setEnabled(false);
			panel2.add(text6);
			
			
			boton2 = new JButton("Acelerar");
			boton2.setBackground(Color.GREEN);
			boton2.setForeground(Color.BLACK);
			boton2.setBounds(40,150,85,30);
			boton2.setActionCommand("acelerar");
			boton2.setEnabled(false);
			panel2.add(boton2);
			
			boton3 = new JButton("Frenar");
			boton3.setBackground(Color.RED);
			boton3.setForeground(Color.WHITE);
			boton3.setBounds(140,150,80,30);
			boton3.setActionCommand("frenar");
	        boton3.setEnabled(false);
			panel2.add(boton3);
			
			boton4 = new JButton("Mover");
			boton4.setBackground(Color.ORANGE);
			boton4.setForeground(Color.BLACK);
			boton4.setBounds(100,190,70,30); 
			boton4.setActionCommand("mover");
		    boton4.setEnabled(false);
			panel2.add(boton4);
			
			imagencolor = new ImageIcon(getClass().getResource("botoncolor.png"));
			botoncolor = new JButton(imagencolor);
			botoncolor.setBounds(220,53,25,25);
			botoncolor.setActionCommand("color");
			botoncolor.setEnabled(false);
			panel2.add(botoncolor);
			
			fotocarro = new ImageIcon(getClass().getResource("fotocarro.png"));
			lbfotocarro = new JLabel(fotocarro);
		    lbfotocarro.setBounds(250, 30, 200, 200);
		    panel2.add(lbfotocarro);
			
			
			imagenPanel2 = new ImageIcon(getClass().getResource("fondo2.png"));
			lbImagenPanel2 = new JLabel(imagenPanel2);
			lbImagenPanel2.setBounds(5,17,490,236);
			lbImagenPanel2.setLayout(null);
	        panel2.add(lbImagenPanel2);
	        
	    
	       
		   
	        //Panel 3 y sus componentes
	        //===================================================
	        panel3 = new JPanel();
	        panel3.setBackground(Color.WHITE);
	        panel3.setBounds(500, 0, 280, 460);
	        panel3.setLayout(null);
	        borde3 = BorderFactory.createTitledBorder("Actividad");
	        borde3.setTitleColor(Color.RED);
	        panel3.setBorder(borde3);
	        add(panel3);
	        
	        actividad = new JTextArea(" Aquí se mostrará la actividad del carro: "+ "\n" + "\n");
	        actividad.setEditable(false);
	        JScrollPane scroll = new JScrollPane();
	        scroll.setViewportView(actividad);
	        scroll.setBounds(10, 17,260, 315);
	        panel3.add(scroll);
	        
	        
	        iBoton = new ImageIcon(getClass().getResource("Imagen1.png"));
			lbImagen2 = new JLabel(iBoton);
			lbImagen2.setBounds(100,350,90,90);
			panel3.add(lbImagen2);
	        
		   
			
			
			
			setLayout(null);
			setResizable(false);
		    setSize(800,500);
		    setVisible(true);
		    setLocationRelativeTo(null);
		    setTitle("Daniel Cars Inc");   
		    setDefaultCloseOperation(EXIT_ON_CLOSE);    
		
		  }
     
		//Metodos de diseño
		
	    public void mostrarcreado()
	    {
	      
	    	JOptionPane.showMessageDialog(null,"¡El Auto se ha creado exitosamente!");
	    	
	    	  
	    }	
	    
		   //Metodos para acceder a la información de las cajas de texto
		    
		    public String getColor()
		    {
		    	return text1.getText(); //getText = método abstracto de la clase JTexlField
		    }
		    public String getposicionx()
		    {
		    	return text2.getText();
		    }
		    public String getposiciony()
		    {
		    	return text3.getText();
		    }
		    public String getnuevaposiciony()
		    {
		    	return text6.getText();
		    }
		    public String getnuevaposicionx()
		    {
		    	return text5.getText();
		    }
		    public String getnuevocolor()
		    {
		    	return text4.getText();
		    }
	        
		    
		   
		   
		    /*Preguntar ¿que es?
		     *   ================================
		    public void BtsAcciones(ActionListener pAL)
		    {
		        boton1.addActionListener(pAL);
		        boton2.addActionListener(pAL);
		        boton3.addActionListener(pAL);
		        boton4.addActionListener(pAL);
		    }
		    
		    ==================================== */
		  
		    //Metodos para permitir acciones a los botones
		    public void desactivarBotonCrear()
		    {
		        boton1.setEnabled(false);
		    }
		
		
		   public void activarBotones()
		    {
		        boton2.setEnabled(true);
		        boton3.setEnabled(true);
		        boton4.setEnabled(true);
		        botoncolor.setEnabled(true);
		        text4.setEnabled(true);
		        text5.setEnabled(true);
		        text6.setEnabled(true);
		    }
		   
		    
		    
		    
		    //Metodos para El area de texto
		    
		    public void mostarDatos(String pdatos)
		    {
		    	  actividad.append( pdatos + "\n");
		    	  
		    	  
		    }
		    
		    //Metodo para borrar datos
		    
		    
		    public void borrar()
		    {
		    	 
		    	 text5.setText(" ");
		    	 text6.setText(" ");
		    	 
		    }
		    
		    public void borrarcolor()
		    {
		    	text4.setText(" ");
		    	
		    }
		    
		    // Metodo para habilitar boton mover cuando se escriba en caja de texto
		    
		 /*   public void habilitarmover()
		    {
		    	if(text5.getText().isEmpty() || text6.getText().isEmpty())
		    	{
		    		boton4.setEnabled(false);
		    	}
		    	else
		    	{
		    		boton4.setEnabled(true);
		    	}
				
		    } 
		    
		 */
		    
		   
}      
         
		 












































		
		
	
		

	

	

