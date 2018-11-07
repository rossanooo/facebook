package oggetti;

public class ArchivioFoto 
{
	private int indice = 0;
	private Foto[] listaFoto;

	public ArchivioFoto(int dimensione) 
	{
		listaFoto = new Foto[dimensione];
	}

	public boolean aggiungiFoto(Foto f, int dimensione) 
	{
		if (indice < dimensione) 
		{
			listaFoto[indice++] = f;
			return true;
		}
		return false;
	}
	
	public void amicoPiùTaggato() 
	{
		for (int i = 0; i < indice; i ++)
		{
			
		}
	}

	public void contaTag() 
	{
		int conta = 0;
		tag = sc.nextLine;
		for (int i = 0; i < indice; i ++)
		{
			if (tag == a)
				conta = conta + 1;
		}
	}
}
