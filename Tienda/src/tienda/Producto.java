package tienda;

import javax.swing.JOptionPane;

public class Producto {
	
// Attributes 
private static int cantMin=10;	
private int bodega;
private String nombreProd;
private double caja=0;
private double precioBase;
private String tipo;
private double precioVenta;
private int can;
private int individualVendidos;

//Constructor

public Producto(String pnombreProd, double pprecioBase, String ptipo)
{
	nombreProd=pnombreProd;
	precioBase=pprecioBase;
	tipo=ptipo;
	bodega=40;
	individualVendidos = 0;
	
}

 //==========================================
public String getNombre()
{
	return nombreProd;
}
public int getCantidadMin()
{
	return cantMin;
}
public double getPrecioBase()
{
    return precioBase;
}
public String getTipo()
{
	return tipo;
}
public double getCaja()
{
	return caja;
}
public int getBodega()
{
	return bodega;
}

public int getcan()
{
	return can;
}
public int getindividualVendidos()
{
	return individualVendidos;
}



//================================================


public void setindividualVendidos(int pcan)
{    
	
	individualVendidos = individualVendidos + pcan;
	
}
public void setcaja(double pcan)
{    
	
	caja = caja + pcan;
	
	
}
public void setBodega(int pcan) 
{
   bodega = getBodega() - pcan;

}


//===========================================
public double Calcularpreciodeventa()
{ 
	
	
	if(tipo=="Supermercado") 
	{
	  precioVenta=precioBase+0.04*precioBase;
	} 
	else
	{   if(tipo=="Drogeria")
		{
		precioVenta=precioBase+0.12*precioBase;
		}
	    else 
	    {
	    	precioVenta=precioBase+0.16*precioBase;	
	    }
	}
	return precioVenta;
	
}

//=======================================================
public void Vender()
{
	
	
	can=Integer.parseInt(JOptionPane.showInputDialog("¿Cúantas unidades de producto desea vender? (máx 30uds)"));
	
	
	if(can>getBodega() || can<=0)
	{  
		JOptionPane.showMessageDialog(null,"Cantidad fuera de rango","Error", JOptionPane.ERROR_MESSAGE);
		Vender();
	}
	else
	{
    
    setindividualVendidos(can);
    setcaja(Calcularpreciodeventa()*can);
    setBodega(can);
	if(bodega<=cantMin)
	{
		JOptionPane.showMessageDialog(null, "Producto parcialmente agotado, por favor abastecer");
		
	}
	}
	
}

//=================================================================
public void Abastecer()
{   int n;
    n=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas unidades desea abastecer? (máximo "+(40-bodega)+" )"));
    if(n>(40-bodega) || n<=0)
	{  
		JOptionPane.showMessageDialog(null,"Cantidad fuera de rango","Error", JOptionPane.ERROR_MESSAGE);
		Abastecer();
	}
	bodega=bodega+n;
}


 
}


