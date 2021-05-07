package tienda;

public class Tienda {
	
	private  Producto product1;
	private  Producto product2;
	private  Producto product3;
	private  Producto product4;
    private double cajaTotal;
    private String masVendido;
    private String menosVendido;
    private int totalVendidos;
    private double promedio;
    
    //Constructor
    public Tienda(Producto pro1, Producto pro2, Producto pro3, Producto pro4)
    {
    	product1 = pro1;
    	product2 = pro2;
    	product3 = pro3;
    	product4 = pro4;
    	
    	
    	
    }
    
    
    // Métodos
    public double getcajatotal()
    {
    	return cajaTotal;
    }
    
    public String getmasvendido() 
    {
    	return masVendido;
    }
    
    public String getmenosvendido()
    {
    	return menosVendido;
    }
    
    public void calcularcajatotal()
    {
        cajaTotal = product1.getCaja() + product2.getCaja() + product3.getCaja() + product4.getCaja();
    }
   
    public String[] calcularmasvendidoymenosvendido()
    {   
    	
    	int a,b,c,d;
    	a = product1.getindividualVendidos();
    	b = product2.getindividualVendidos();
    	c = product3.getindividualVendidos();
    	d = product4.getindividualVendidos();
    	
    	int []product = {a,b,c,d};
    	int local;
    	
    	String ordenVentas[];
		ordenVentas = new String [4];
    	
    	for(int i=0; i<4; i++)
    	{
    		for(int j=i+1; j<4; j++)

    	        {
    			    if(product[i]<product[j])
    			    {
    			    	
    			    	local = product[i];
    			    	product[i] = product[j];
    			    	product[j] = local;
    			    }
    			}
    		
    		for(int k=0; k<4; k++)
    		{
    			if(product[k]==a) { ordenVentas[k] = product1.getNombre();}else
    			if(product[k]==b) { ordenVentas[k] = product2.getNombre();}else
    			if(product[k]==c) { ordenVentas[k] = product3.getNombre();}else
    			if(product[k]==d) { ordenVentas[k] = product4.getNombre();}
    		}
    			
    	}   return ordenVentas;
    	
    }
    	
    	//=================================================================
    	
    	public String masVendido()
    	{
    		
    		String[] estadisticas = calcularmasvendidoymenosvendido();
    		
    			
    		return estadisticas[0];
    		
    	}
       
    	public String medioVendido()
    	{
    		
    		String[] estadisticas = calcularmasvendidoymenosvendido();
    		
    			
    		return estadisticas[1];
    		
    	}
    	
    	public String medio2Vendido()
    	{
    		
    		String[] estadisticas = calcularmasvendidoymenosvendido();
    		
    			
    		return estadisticas[2];
    		
    	}
    	public String menosVendido()
    	{
    		
    		String[] estadisticas = calcularmasvendidoymenosvendido();
    		
    			
    		return estadisticas[3];
    		
    	}
    	
    //==========================================================================	
    public int calculartotalvendidos()
    {
    	
    	totalVendidos = product1.getindividualVendidos()+product2.getindividualVendidos()+product3.getindividualVendidos()+product4.getindividualVendidos();
    	
    	return totalVendidos;
    }
    
    public double calcularpromedioventas()
    {
    	
    	promedio = getcajatotal()/calculartotalvendidos();
    	
    	return promedio;
    	
 	
    }
    
    public void cambiarproducto1(Producto npro1)
    {	
    	
    	product1 = npro1;
    			
    }
    
    public void cambiarproducto2(Producto npro2)
    {	
    	
    	product2 = npro2;
    			
    }
    
    public void cambiarproducto3(Producto npro3)
    {	
    	
    	product3 = npro3;
    			
    }
    
    public void cambiarproducto4(Producto npro4)
    {	
    	
    	product4 = npro4;
    			
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
