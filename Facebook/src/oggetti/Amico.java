package oggetti;

public class Amico 
{
	private String nome;
	private String cognome;
	private int eta;
	
	public Amico(String nome, String cognome, int eta) 
	{
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome.toLowerCase();
	}

	public String getCognome() 
	{
		return cognome;
	}

	public void setCognome(String cognome) 
	{
		this.cognome = cognome;
	}

	public int getEta() 
	{
		return eta;
	}

	public void setEta(int eta) 
	{
		if (eta>=0) this.eta = eta;
	}
}
