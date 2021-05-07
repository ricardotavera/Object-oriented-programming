package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import GUI.GUI;
import tienda.Producto;
import tienda.Tienda;
public class Controller implements ActionListener {
	
	private Date fecha;
	private GUI gui;
	private Producto product1,product2,product3,product4;
	private Tienda tenda;
	
	public Controller(GUI pgui,Tienda ptienda,Producto pProduct1,Producto pProduct2,Producto pProduct3,Producto pProduct4)
	{
	    this.gui = pgui;
	    this.tenda = ptienda;
	    this.gui.GUIproducto1.BtsAcciones(this);
	    this.gui.GUIproducto2.BtsAcciones(this);
	    this.gui.GUIproducto3.BtsAcciones(this);
	    this.gui.GUIproducto4.BtsAcciones(this);
	    this. product1 = pProduct1;
	    this. product2 = pProduct2;
	    this. product3 = pProduct3;
	    this. product4 = pProduct4;
	    
	}
	
	public void comunicarinicio() 
	{
		
		gui.GUIproducto1.mostarDatos("\n"+"Precio base $: "+"\n"+product1.getPrecioBase()+"\n");
		gui.GUIproducto1.mostarDatos("Tipo: "+"\n"+product1.getTipo()+"\n");
		gui.GUIproducto2.mostarDatos("\n"+"Precio base $: "+"\n"+product2.getPrecioBase()+"\n");
		gui.GUIproducto2.mostarDatos("Tipo: "+"\n"+product2.getTipo()+"\n");
		gui.GUIproducto3.mostarDatos("\n"+"Precio base $: "+"\n"+product3.getPrecioBase()+"\n");
		gui.GUIproducto3.mostarDatos("Tipo: "+"\n"+product3.getTipo()+"\n");
		gui.GUIproducto4.mostarDatos("\n"+"Precio base $: "+"\n"+product4.getPrecioBase()+"\n");
		gui.GUIproducto4.mostarDatos("Tipo: "+"\n"+product4.getTipo()+"\n");
		gui.GUIproducto1.mostarBodega(" "+product1.getBodega());
		gui.GUIproducto2.mostarBodega(" "+product2.getBodega());
		gui.GUIproducto3.mostarBodega(" "+product3.getBodega());
		gui.GUIproducto4.mostarBodega(" "+product4.getBodega());
		
		
	}
	  
	  public Date getFecha()
	  {
		  fecha = new Date();
		  return fecha;
	  }
	 
	

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String comando = ae.getActionCommand();
		
		
		if(comando.equals("vender1"))
		{
			
			product1.Vender();
			gui.GUIproducto1.borrar();
			gui.GUIproducto1.mostarBodega(" "+product1.getBodega());
			gui.GUIcambios.mostarDatos(" "+getFecha());
			gui.GUIcambios.mostarDatos("Se han vendido "+product1.getcan()+" uds de "+product1.getNombre()+" a $ "+product1.Calcularpreciodeventa()+" c/u");
			
			
			gui.GUIEstadisticas.borrar();
			tenda.calcularcajatotal();
			gui.GUIEstadisticas.mostarDatos("Caja: $ "+tenda.getcajatotal());
			gui.GUIEstadisticas.mostarDatos("Total Vendidos:  "+tenda.calculartotalvendidos());
			gui.GUIEstadisticas.mostarDatos("Promedio :"+tenda.calcularpromedioventas());
			gui.GUIEstadisticas.mostarDatos("Mas vendido: "+tenda.masVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medioVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medio2Vendido());
			gui.GUIEstadisticas.mostarDatos("Menos vendido "+tenda.menosVendido());
			
		}
		
		if (comando.equals("abastecer1"))
		{
			
			product1.Abastecer();
			gui.GUIproducto1.borrar();
			gui.GUIproducto1.mostarBodega(" "+product1.getBodega());
				
		
		}
		
		
		if(comando.equals("vender2"))
		{
			
			product2.Vender();
			gui.GUIproducto2.borrar();
			gui.GUIproducto2.mostarBodega(" "+product2.getBodega());
			gui.GUIcambios.mostarDatos(" "+getFecha());
			gui.GUIcambios.mostarDatos("Se han vendido "+product2.getcan()+" uds de "+product2.getNombre()+" a $ "+product2.Calcularpreciodeventa()+" c/u");
			
			
			gui.GUIEstadisticas.borrar();
			tenda.calcularcajatotal();
			gui.GUIEstadisticas.mostarDatos("Caja: $ "+tenda.getcajatotal());
			gui.GUIEstadisticas.mostarDatos("Total Vendidos:  "+tenda.calculartotalvendidos());
			gui.GUIEstadisticas.mostarDatos("Promedio :"+tenda.calcularpromedioventas());
			gui.GUIEstadisticas.mostarDatos("Mas vendido: "+tenda.masVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medioVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medio2Vendido());
			gui.GUIEstadisticas.mostarDatos("Menos vendido "+tenda.menosVendido());
			
		}
		
		if (comando.equals("abastecer2"))
		{
			
			product2.Abastecer();
			gui.GUIproducto2.borrar();
			gui.GUIproducto2.mostarBodega(" "+product2.getBodega());
				
		
		}
		if(comando.equals("vender3"))
		{
			
			product3.Vender();
			gui.GUIproducto3.borrar();
			gui.GUIproducto3.mostarBodega(" "+product3.getBodega());
			gui.GUIcambios.mostarDatos(" "+getFecha());
			gui.GUIcambios.mostarDatos("Se han vendido "+product3.getcan()+" uds de "+product3.getNombre()+" a $ "+product3.Calcularpreciodeventa()+" c/u");
			
			
			gui.GUIEstadisticas.borrar();
			tenda.calcularcajatotal();
			gui.GUIEstadisticas.mostarDatos("Caja: $ "+tenda.getcajatotal());
			gui.GUIEstadisticas.mostarDatos("Total Vendidos:  "+tenda.calculartotalvendidos());
			gui.GUIEstadisticas.mostarDatos("Promedio :"+tenda.calcularpromedioventas());
			gui.GUIEstadisticas.mostarDatos("Mas vendido: "+tenda.masVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medioVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medio2Vendido());
			gui.GUIEstadisticas.mostarDatos("Menos vendido "+tenda.menosVendido());
			
		}
		
		if (comando.equals("abastecer3"))
		{
			
			product3.Abastecer();
			gui.GUIproducto3.borrar();
			gui.GUIproducto3.mostarBodega(" "+product3.getBodega());
				
		
		}
		if(comando.equals("vender4"))
		{
			
			product4.Vender();
			gui.GUIproducto4.borrar();
			gui.GUIproducto4.mostarBodega(" "+product4.getBodega());
			gui.GUIcambios.mostarDatos(" "+getFecha());
			gui.GUIcambios.mostarDatos("Se han vendido "+product4.getcan()+" uds de "+product4.getNombre()+" a $ "+product4.Calcularpreciodeventa()+" c/u");
			
			
			gui.GUIEstadisticas.borrar();
			tenda.calcularcajatotal();
			gui.GUIEstadisticas.mostarDatos("Caja: $ "+tenda.getcajatotal());
			gui.GUIEstadisticas.mostarDatos("Total Vendidos:  "+tenda.calculartotalvendidos());
			gui.GUIEstadisticas.mostarDatos("Promedio :"+tenda.calcularpromedioventas());
			gui.GUIEstadisticas.mostarDatos("Mas vendido: "+tenda.masVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medioVendido());
			gui.GUIEstadisticas.mostarDatos("intermedio: "+tenda.medio2Vendido());
			gui.GUIEstadisticas.mostarDatos("Menos vendido "+tenda.menosVendido());
			
		}
		
		if (comando.equals("abastecer4"))
		{
			
			product4.Abastecer();
			gui.GUIproducto4.borrar();
			gui.GUIproducto4.mostarBodega(" "+product4.getBodega());
				
		
		}
	 } 
	}
	
	   
	

