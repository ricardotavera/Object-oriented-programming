package GUI;

import java.awt.Color;

import javax.swing.*;


public class Inventory extends JFrame
{    
	JTextArea inventory;
	
    public Inventory()
    {
    	
    	
    	
    	    inventory = new JTextArea("\n" + "\n"+"                                                                                                                   Welcome to Mr. Perez's Library "+ "\n" + "\n"+ "\n" + "\n");
	        inventory.setEditable(false);
	        JScrollPane scroll = new JScrollPane();
	        scroll.setViewportView(inventory);
	        scroll.setBounds(0, 0,900, 600);
	        add(scroll);
	        
	        
	        
    	   this.setSize(900,600);
    	   this.setVisible(true);
    	   this.setLayout(null);
    	   this.setLocationRelativeTo(null);
           this.setTitle("Inventory");   
           this.setResizable(false);
    	
    	
    	
 
    }
    
    
    
    public void mostarDatos(String pdatos)
    {
    	  inventory.append(pdatos + "\n");
    	  
    	  
    }
}
