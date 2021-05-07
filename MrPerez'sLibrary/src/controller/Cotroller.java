package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import GUI.Inventory;
import GUI.Reception;
import GUI.SignUp;
import brain.Book;
import brain.Collection;
import brain.Ordinary;

public class Cotroller implements ActionListener
{
     private SignUp si;
     private Reception re;
     private Inventory in;
     private Book ord, colle;
     private ArrayList<Book> books;
     private static int c=0;
     
     public Cotroller(JFrame pre)  //, SignUp psi, Inventory pin)
     {
    	 re = (Reception) pre;
    	 re.listenButtons(this);
    	 books = new ArrayList<Book>();
     }
	
	public void actionPerformed(ActionEvent arg) 
	{
		
		String comando = arg.getActionCommand();
		
		if(comando.equals("signup"))
		{
			si = new SignUp();
			si.listenButtons(this);
		}	
			
		
		
	    if(comando.equals("check"))
			{
				
				si.active();  		
            }
		
		if(comando.equals("up")) 
		{ 
		  try
		  {
			if(si.getnameCollection().isEmpty()==true)
		    {   
			 
				ord = new Ordinary(si.getName(), si.getAuthor(), Integer.parseInt(si.getEdicion()), si.getBrand());
				books.add(ord);
				
		        JOptionPane n = new JOptionPane();
		        n.showMessageDialog(null, "Successful process!");
		        if(n.OK_OPTION==0)
		        {
		        	si.dispose();
		        }
		    }
	      else
	         {   
		       colle =  new Collection(si.getName(), si.getAuthor(), Integer.parseInt(si.getEdicion()), si.getBrand(), si.getnameCollection(), si.getNumberCollection());
	           books.add(colle);
	           
	           JOptionPane n = new JOptionPane();
		        n.showMessageDialog(null, "Successful process!");
		        if(n.OK_OPTION==0)
		        {
		        	si.dispose();
		        }
	         }
		         c++;
			
		}
		  catch(Exception e)
		  {
			  JOptionPane.showMessageDialog(null, "Badly entered data","Error", JOptionPane.ERROR_MESSAGE);
		  }
			
	    }
	
	
	
	
		
		if(comando.equals("go"))
		{ 
			  
		
			if(c>0) 
			{ 
			 in = new Inventory();
			   
			 in.mostarDatos("Books:"+c+ "\n");
			 
			 if(c==2) { books.set(0, new Ordinary("La iliada", "Homero", 300, true)); }
			 
			// Bucle for each
			for(Book i:books)
			    {
				 
				in.mostarDatos(i.toString());
				
			    }
			}
			else
			{
				JOptionPane.showMessageDialog(null, "There are not any books","Error", JOptionPane.ERROR_MESSAGE);
			}
		
		
			//JOptionPane.showMessageDialog(null, "It has happened a wrong!","Error", JOptionPane.ERROR_MESSAGE);	
		}
	
	}
  }


