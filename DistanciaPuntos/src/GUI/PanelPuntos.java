package GUI;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelPuntos extends JPanel 
{
	public JButton crearpunto,borrarpunto;
	public JLabel x,y;
	public JTextField tfx,tfy;
	
	
	
	
      
	public PanelPuntos(String nombre,String comando1, String comando2)
	{
		
		
		x = new JLabel("Absiza");
		x.setBounds(15, 25, 60, 30);
		this.add(x);
		
		y = new JLabel("Ordenada");
		y.setBounds(15, 65, 60, 30);
		this.add(y);
		
		tfx = new JTextField();
		tfx.setBounds(120, 25,100, 30);
		this.add(tfx);
		
		tfy = new JTextField();
		tfy.setBounds(120, 65, 100, 30);
		this.add(tfy);
		
		crearpunto = new JButton("Crear pto");
		crearpunto.setBounds(300, 25, 120, 40);
		crearpunto.setBackground(Color.RED);
		crearpunto.setForeground(Color.WHITE);
		crearpunto.setActionCommand(comando1);
		this.add(crearpunto);
		
		borrarpunto = new JButton("borrar pto");
		borrarpunto.setBounds(300,65 , 120, 30);
		borrarpunto.setBackground(Color.BLACK);
		borrarpunto.setForeground(Color.WHITE);
		borrarpunto.setActionCommand(comando2);
		this.add(borrarpunto);
		
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		TitledBorder borde = BorderFactory.createTitledBorder(nombre);
	    borde.setTitleColor(Color.BLUE);
	    setBorder(borde);
	    
	   checkTextField();
	    
		
	}
	
	public void Activarbotones(ActionListener activar)
	{
		crearpunto.addActionListener(activar);
        borrarpunto.addActionListener(activar);
		
	}
	
	
	public String gettfx()
	{
		 return tfx.getText();
	}

	public String gettfy()
	{
		 return tfy.getText();
	}
	
	public void borrar()
	{
		
		
		tfx.setText(" ");
		tfy.setText(" ");
		
		
		
	}
	public void checkTextField() 
	{  int n = 0;
		do 
		{
		  /* if(tfx.getText().isEmpty() && tfy.getText().isEmpty())
		   {
			 // crearpunto.setEnabled(false);
			  n++;
		   }
		   */
		}while(true);
	
	}






}

