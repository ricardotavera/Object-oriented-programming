package brain;

import javax.swing.JOptionPane;

public class Book 
{
	//Attributes
  protected String name;
  protected String author;
  protected int edicion;
  protected boolean highEdicion;
  
  
  
 //From here begin methods 

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public int getEdicion() {
	return edicion;
}
public void setEdicion(int pedicion) {
	edicion = pedicion;
}
public boolean isHighEdicion() {
	return highEdicion;
}
public void setHighEdicion(boolean highEdicion) {
	this.highEdicion = highEdicion;
}
  
public String getYesNo()
{   
	String local;
	if(highEdicion==true)
	{
		local = "Yes";
	}
	else
	{
		local = "No";
	}
		
	return local;
}
 
public String determinateAuthor(String pAuthor)
{
	
	String localAuthor;
	if(pAuthor.contains(";"))
	{
		localAuthor = pAuthor.substring(0, pAuthor.indexOf(";"))+" more others"; 
		
	}
	else
	{
		localAuthor = pAuthor;
	}
	return localAuthor;
}
  
  public void finalize()  
  {
	  JOptionPane.showMessageDialog(null, name+" has been deleted");
  }
 
}
