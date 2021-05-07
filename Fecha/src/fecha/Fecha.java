package fecha;

public class Fecha 
{ 
	protected int dia;
	protected int mes;
	protected int year;
	
	
	
	public Fecha(int pd, int pm, int pa)
	{
		dia = pd;
		mes = pm;
		year = pa;
	}
	public Fecha(String formatofecha)
	{
		dia = Integer.parseInt(formatofecha.substring(0, 2));
		mes = Integer.parseInt(formatofecha.substring(3, 5));
		year = Integer.parseInt(formatofecha.substring(6, 10));
		
	}
	
	public int getDia()
	{
		return dia;
	}
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	public int getMes()
	{
		return mes;
	}
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	public int getYear()
	{   
		return year;
		
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public String toString()
	{
		
		return dia+"/"+mes+"/"+year;
		
	}
	
	
	
	public boolean equals(Object o)
	{
	   Fecha k = (Fecha)o;
		
	   return (dia==k.dia) && (mes==k.mes) && (year==k.year);
		
		
	}
  
	private int convertirFechaADias()
	{    
		return year*360 + (mes-1)*30 + dia; 
	}
	
	private int diasNetos(int pcantDias, int pdiasFecha)
	{
		return pcantDias + pdiasFecha;
	}
	
	private void nuevaFecha(int numdias)
	{
		
		year = (int) numdias/360;                            //Calcular anios tomando la parte entera de la división #dias/360
		mes =  (int) ((numdias%360)/30)+1;                     //Calcular meses tomando la parte entera de  diassobrantes/30;
		dia =  (numdias%360)%30;                             //Calcular dias como el modulo(%) de diassobrante/30;       
		
		
	}
	public void sumarDias(int pcantDias)
	{
		
		int a, b;
		a = convertirFechaADias();
		b = diasNetos(pcantDias, a);
		nuevaFecha(b);
		
	}

	public void determinateLeap() 
	{
		if((year%4)==0)
		{
			System.out.println("Leap Year");
			
			
		}
	  	
	}
	
	
}
