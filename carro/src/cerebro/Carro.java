package cerebro;

public class Carro {

//¿Qué atributos tiene el carro? El carro tiene un color, Posición: x & y, Numero de ruedas, velocidad, Aceleración;
	
private String color,nombre;
private double px,py,vel;
private static int ruedas = 4;
private int ace;
//Constructor: lleva el mismo nombre de la clase, permite crear objetos es el "Molde", es de tipo publico y ya;

public Carro(String pacolor, String panombre, double papx, double papy ) 
{
	color = pacolor;
	nombre = panombre;
	px = papx;
	py = papy;
	vel = 0;
	ace = 0;
	
}

//Métodos de devolución de datos ingresados o modificados posteriormente




public String getcolor()
{
	return color;
}
public String getnombre()
{
	return nombre;
}
public double getpx()
{
	return px;
}
public double getpy()
{
	return py;
}
public double getvel()
{
	return vel;
}
public int getace()
{   
		return ace;
}
public int getruedas() 
{
	return ruedas;
}	
//Métodos de modificación 

public void setcolor(String pacolor)
{
	color = pacolor;
}
public void setnombre(String panombre)
{
	nombre = panombre;
}
public void setpx(double papx)
{
	px = papx;
}
public void setpy(double papy)
{
	py = papy;
}
public void setvel(double pavel)
{
	vel = pavel;
}


// Métodos que permiten solucionar el problemas

public void mover(double papx, double papy)
{
	if(px!=papx)
	{
		setpx(papx);
		
	}
	if(py!=papy)
	{
		setpy(papy);
	}
		
		
}

public double acelerar()
{   
    ace = (int) (Math.random()*9+1);
    
	setvel(getvel()+ ace);
	return getvel();
	
}

public double fenar()
{
	if(getvel()>10)
	{
		setvel(getvel()-10);
	}
	else
	{
		setvel(0);
	}
	return getvel();
}























}
