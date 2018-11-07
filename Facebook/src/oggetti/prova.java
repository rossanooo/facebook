package oggetti;

import java.util.Scanner;

public class prova 
{
	private static Scanner sc;

	public static void main (String [] args)
	{
		int scelta;
		boolean flag = false;
		int x = 0;
		int y = 0;
		String titolo;
		String tag;
		boolean controllo = false;
		boolean amiciiniz = false;
		boolean fotoiniz = false;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("Inserisci il numero corrispondente a ciò che vuoi fare");
			System.out.println("3 = Controlla quante volte un amico è stato taggato");
			System.out.println("4 = Guarda chi è l'amico più taggato");
			System.out.println("5 = Fine");
			System.out.println("Sappi che per eseguire i metodi 3 e 4 devi eseguire i metodi 1 e 2 almeno una volta");
			scelta = sc.nextInt();
			switch (scelta) 
			{
				case 1:
					String nome;
					String cognome;
					int eta;
					System.out.println("Inserisci il numero di amici da aggiungere: ");
					int x1 = sc.nextInt();
					sc.nextLine();
					ArchivioAmici l1 = new ArchivioAmici(x1);
					System.out.println("Inserisci il nome dell'amico.");
					nome = sc.nextLine();
					System.out.println("Inserisci il cognome dell'amico.");
					cognome = sc.nextLine();
					System.out.println("Inserisci l'età dell'amico.");
					eta = sc.nextInt();
	 				Amico a = new Amico(nome, cognome, eta);
	 				l1.aggiungiAmico(a);
	 				amiciiniz = true;
					break;
				
				case 2:
					System.out.println("Inserisci il numero di foto da aggiungere: ");
					int y1 = sc.nextInt();
					sc.nextLine();
					ArchivioFoto l2 = new ArchivioFoto(y1);
	 				System.out.println("inserisci il titolo della foto");
	 				titolo= sc.nextLine();
	 				System.out.println("Inserisci il tag della foto");
	 				tag = sc.nextLine();
	 				Foto f = new Foto(titolo, tag);
					l2.aggiungiFoto(f, y1);
				
				case 3:
					if (amiciiniz == true && fotoiniz == true) 
					{
						ArchivioFoto ogg1 = new ArchivioFoto(y);
					} 
					else 
					{
						if (amiciiniz == false) 
						{
							System.out.println("Devi creare almeno un amico");
						}
						if (fotoiniz == false)
						{
							System.out.println("Devi caricare almeno una foto");
						}
					}
					break;
				
				case 4:
					if (amiciiniz == true && fotoiniz == true)
					{
						ArchivioFoto ogg2 = new ArchivioFoto(y);
						ogg2.amicoPiùTaggato();
					} 
					else 
					{
						if (amiciiniz == false) 
						{
							System.out.println("Devi creare almeno un amico");
						}
						if (fotoiniz == false)
						{
							System.out.println("Devi caricare almeno una foto");
						}
					}
					break;
			
				case 5:
					flag = true;
					controllo = true;
					break;
					
				default:
					System.out.println("Inserimento errato");
			}
		} while (controllo = true);
	}	
}
