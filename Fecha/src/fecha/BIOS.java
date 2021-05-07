package fecha;

import javax.swing.JOptionPane;

//===================================================================
//              DANIEL RICARDO TAVERA CAMACHO 
//===================================================================

public class BIOS 
{
   public static void main(String[] args)
   {   
	  String date = JOptionPane.showInputDialog("Type the date in the format dd/mm/yy: ");
      //String date = "12/08/2020";
	 Fecha n = new DetailedDate(date);
	  
	  
	  System.out.println("Day "+n.getDia());
	  System.out.println("Month "+n.getMes());
	  System.out.println("Year "+n.getYear()); 
	  n.determinateLeap();
	  System.out.println("\n"+n);
	  
	 

	  
	  System.exit(0);
   }
}
