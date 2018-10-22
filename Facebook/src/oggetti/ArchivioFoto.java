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
}
