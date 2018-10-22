package oggetti;

public class prova 
{
	public static void main (String [] args)
	{
		ArchivioAmici friends = new ArchivioAmici(10);
		
		Amico a;
    	
	    a = new Amico ("Roberto", "Spotti", 53);
			
		friends.aggiungiAmico(a);
		
		a = new Amico ("Paolino", "Paperino",100);
		
		friends.aggiungiAmico(a);
		
		a = friends.cerca("Paperino");
	
		System.out.println(a.getNome());
		System.out.println(a.getCognome());
		System.out.println(a.getEta());		

	}
}
