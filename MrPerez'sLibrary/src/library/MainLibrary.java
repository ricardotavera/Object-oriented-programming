package library;

import javax.swing.JFrame;


import GUI.Reception;
import GUI.SignUp;
import brain.Book;
import brain.Collection;
import brain.Ordinary;
import controller.Cotroller;
import brain.Ordinary;
//================================
//DANIEL RICARDO TAVERA CAMACHO
//================================
public class MainLibrary 
{
	public static void main(String[] args) 
	{
	   JFrame r = new Reception();	
	   Cotroller c = new Cotroller(r);
	   
	}

}
