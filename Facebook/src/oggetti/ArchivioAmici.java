package oggetti;

public class ArchivioAmici 
{
	private int indice=0;
	private Amico [] listaAmici;
	
	public ArchivioAmici (int dimensione) 
	{
		listaAmici=new Amico[dimensione];
	}
	
	public boolean aggiungiAmico(Amico a) 
	{
		if (indice <10) 
		{
			listaAmici[indice++]=a;
			return true;
		}
		return false;
	}
	
	public Amico cerca(String cognome) 
	{
		for (Amico a: listaAmici ) 
		{
			if ( cognome.equals(a.getCognome()) ) 
			{
				return a;
			}
		}
		return null;
	}
}
