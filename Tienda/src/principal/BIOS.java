package principal;
import GUI.GUI;
import controller.Controller;
import tienda.Producto;
import tienda.Tienda;

public class BIOS {

	
 public static void main(String[] args) 
 {
	 
	  GUI in = new GUI();
	  Producto pro1 = new Producto("Aerogel",18000,"Drogeria");
	  Producto pro2 = new Producto("Cuaderno",1500,"Papeleria");
	  Producto pro3 = new Producto("Mantequilla",1200,"Supermercado");
	  Producto pro4 = new Producto("Alcogol",5000,"Drogeria");
	  Tienda tienda = new Tienda(pro1,pro2,pro3,pro4);
	  Controller control = new Controller(in,tienda,pro1,pro2,pro3,pro4);	
	  control.comunicarinicio();
		
  }	
}

















































































/*

//===================================================== CODIGO PARA HACER PRACTICAS
// GUI in = new GUI();
Producto pr1 = new Producto("Aerogel",2000,"Drogeria");
Producto pr2 = new Producto("Cuaderno",1500,"Papeleria");
Producto pr3 = new Producto("Alcogol",5000,"Drogeria");
Producto pr4 = new Producto("Mantequilla",1200,"Supermercado");

Tienda tienda = new Tienda(pr1,pr2,pr3,pr4);
// Controller con = new Controller(pro,in);

String[] estadisticas = tienda.calcularmasvendidoymenosvendido();
for(int i=0; i<4; i++)
{
	System.out.println(estadisticas[i]);
}

pr1.Vender();
pr2.Vender();
pr3.Vender();
pr4.Vender();
tienda.calcularcajatotal();


// System.out.println("El precio es: "+pr2.Calcularpreciodeventa());
// System.out.println("La cantidad en bodega es: "+pr2.getBodega());
System.out.println("El precio base de: "+pr1.getNombre()+" es "+pr1.getPrecioBase());
System.out.println("El precio base de: "+pr2.getNombre()+" es "+pr2.getPrecioBase());
System.out.println("El precio base de: "+pr3.getNombre()+" es "+pr3.getPrecioBase());
System.out.println("El precio base de: "+pr4.getNombre()+" es "+pr4.getPrecioBase());
System.out.println("El tipo de: "+pr1.getNombre()+" es "+pr1.getTipo());
System.out.println("El tipo de: "+pr2.getNombre()+" es "+pr2.getTipo());
System.out.println("El tipo de: "+pr3.getNombre()+" es "+pr3.getTipo());
System.out.println("El tipo de: "+pr4.getNombre()+" es "+pr4.getTipo());

System.out.println("Se han vendido "+pr1.getindividualVendidos()+" unidades de "+pr1.getNombre()+" a "+pr1.Calcularpreciodeventa());
System.out.println("Se han vendido "+pr2.getindividualVendidos()+" unidades de "+pr2.getNombre()+" a "+pr2.Calcularpreciodeventa());
System.out.println("Se han vendido "+pr3.getindividualVendidos()+" unidades de "+pr3.getNombre()+" a "+pr3.Calcularpreciodeventa());
System.out.println("Se han vendido "+pr4.getindividualVendidos()+" unidades de "+pr4.getNombre()+" a "+pr4.Calcularpreciodeventa());
System.out.println("En caja hay $: "+tienda.getcajatotal());
System.out.println("Se han vendido: "+tienda.calculartotalvendidos()+" unidades de producto");
System.out.println("El promedio en ventas es $: "+tienda.calcularpromedioventas());




String[] estadisticas2 = tienda.calcularmasvendidoymenosvendido();
	for(int i=0; i<4; i++)
	{
		System.out.println(estadisticas2[i]);
	}
	
Producto pr5 = new Producto("Arroz",1850,"Supermercado");	
pr1 = pr5;

String[] estadisticas3 = tienda.calcularmasvendidoymenosvendido();
for(int i=0; i<4; i++)
{
	System.out.println(estadisticas3[i]);
}

pr1.Vender();
pr2.Vender();
pr3.Vender();
pr4.Vender();
tienda.calcularcajatotal();


// System.out.println("El precio es: "+pr2.Calcularpreciodeventa());
// System.out.println("La cantidad en bodega es: "+pr2.getBodega());
System.out.println("Se han vendido "+pr1.getindividualVendidos()+" unidades de "+pr1.getNombre()+" a "+pr1.Calcularpreciodeventa());
System.out.println("Se han vendido "+pr2.getindividualVendidos()+" unidades de "+pr2.getNombre()+" a "+pr2.Calcularpreciodeventa());
System.out.println("Se han vendido "+pr3.getindividualVendidos()+" unidades de "+pr3.getNombre()+" a "+pr3.Calcularpreciodeventa());
System.out.println("Se han vendido "+pr4.getindividualVendidos()+" unidades de "+pr4.getNombre()+" a "+pr4.Calcularpreciodeventa());
System.out.println("En caja hay $: "+tienda.getcajatotal());
System.out.println("El promedio en ventas es $: "+tienda.calculartotalvendidos());
System.out.println("El promedio en ventas es $: "+tienda.calcularpromedioventas());

String[] estadisticas4 = tienda.calcularmasvendidoymenosvendido();
	for(int i=0; i<4; i++)
	{
		System.out.println(estadisticas2[i]);
	}

// pr2.Vender();
// System.out.println("El precio es: "+pr2.Calcularpreciodeventa());
// System.out.println("La cantidad en bodega es: "+pr2.getBodega());
// System.out.println("Se han vendido "+pr2.getindividualVendidos()+"unidades");
// System.out.println("En caja hay $: "+pr2.getCaja()); 
* 



System.exit(0); 


*/