package brain;

import javax.swing.JOptionPane;

public class Ordinary extends Book 
{
  
	
	
	public Ordinary(String pname, String pauthor, int pedicion, boolean phighedition)
	{
		name = pname;
		author = determinateAuthor(pauthor);
		edicion = pedicion;
		highEdicion = phighedition;
		
		
	}
	
	public String toString()
	{
		
		return  "Name: "+name+"\n"+"Author: "+author+"\n"+"Edicion: "+edicion+"\n"+"High Edicion: "+getYesNo()+"\n"+"=======================================================================================================================";
		
	}
	  
}
