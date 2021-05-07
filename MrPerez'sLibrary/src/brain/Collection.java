package brain;

public class Collection extends Book 
{
	//Attributes
	private String nameCollection;
	private int numerAtCollection;

	public Collection(String pname, String pauthor, int pedicion, boolean phighedition, String pnameCollection, int pnumberAtcollection )
	{
		name = pname;
		author = determinateAuthor(pauthor);
		edicion = pedicion;
		highEdicion = phighedition;
		nameCollection = pnameCollection;
		numerAtCollection = pnumberAtcollection;
		
	}
	 public String toString()
	 {
		 
		 return   "Name: "+name+"\n"+"Author: "+author+"\n"+"Edicion: "+edicion+"\n"+"High Edicion: "+getYesNo()+"\n"+"Name of Collection: "+nameCollection+"\n"+"Number at Collection: "+numerAtCollection+"\n"+"=======================================================================================================================";
		 
	 }
}
