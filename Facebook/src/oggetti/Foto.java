package oggetti;

public class Foto 
{
	String titolo;
	String tag;
	
	public Foto(String titolo, String tag) 
	{
		this.titolo = titolo;
		this.tag = tag;
	}

	public void setTitolo(String titolo) 
	{
		this.titolo = titolo;
	}
	
	public String getTitolo() 
	{
		return titolo;
	}

	public void setTag(String tag) 
	{
		this.tag = tag;
	}
	
	public String getTag() 
	{
		return tag;
	}
}
