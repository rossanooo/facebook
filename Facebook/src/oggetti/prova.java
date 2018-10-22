package oggetti;

import java.util.Scanner;

public class prova 
{
	private static Scanner sc;

	public static void main (String [] args)
	{
		ArchivioAmici friends = new ArchivioAmici(10);
		Amico a;
		inserisciAmico(friends, a);
		System.out.println(a.getNome() + " " + a.getCognome() + a.getEta());

	}
	
	public static void inserisciAmico (ArchivioAmici friends, Amico a)
	{
		
		sc = new Scanner(System.in);
		System.out.print("Inserisci il nome del tuo amico: ");
		String nome = sc.nextLine();
		System.out.println("");
		System.out.print("Inserisci il cognome del tuo amico: ");
		String cognome = sc.nextLine();
		System.out.println("");
		System.out.print("Inserisci l'età del tuo amico: ");
		a.setNome(nome);
		a.setCognome(cognome);		
		int eta = sc.nextInt();
		a.setEta(eta);
		friends.aggiungiAmico(a);
	}
}
