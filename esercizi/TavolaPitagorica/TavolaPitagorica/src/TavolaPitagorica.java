
/**
 * Rappresentare la tavola pitagorica NxN dove l'intero N è un parametro di costruzione della classe
 * 
 * La classe deve poter restituire il valore della tabella in corrispondenza della posizione (i, j)
 * 
 * La classe deve poter stampare l'intera tavola
 * 
 * @author Andrea Gasparini
 *
 */
public class TavolaPitagorica 
{
	private int n = 0;
	private int tavolaPitagorica[][];
	
	/**
	 * Crea un oggetto TavolaPitagorica formata da n tabelline
	 * 
	 * @param n numero di tabelline da rappresentare nella tavola pitagorica
	 */
	public TavolaPitagorica(int n)
	{
		n = n + 2;
		this.n = n;
		tavolaPitagorica = new int[n][n];
		
		for (int rg = 1; rg < n; rg++)
			for (int cl = 1; cl < n; cl++)
			{
				if(rg == 1)
				{
					tavolaPitagorica[0][cl] = cl-1;
					tavolaPitagorica[cl][0] = cl-1;
				}
				tavolaPitagorica[rg][cl] = tavolaPitagorica[0][cl] * tavolaPitagorica[rg][0];
				tavolaPitagorica[cl][rg] = tavolaPitagorica[rg][cl];
			}
	
	}
	
	/**
	 * Restituisce il valore della tavola in corrispondenza della posizione (i, j)
	 * 
	 * @param i indice della colonna
	 * @param j indice della riga
	 * @return il valore nella posizione (i, j) della tavola
	 */
	public int valore(int i, int j) { return tavolaPitagorica[i][j]; }
	
	/**
	 * Restituisce l'intera tavola pitagorica sotto forma di stringa, formattata per righe e colonne
	 * 
	 * @return una stringa contenente la rappresentazione grafica della tavola
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < n; i++)
		{
			for (int ii = 0; ii < n; ii++)
				if(tavolaPitagorica[i][ii] < 10 && tavolaPitagorica[i][ii] >= 0)
					if(i == 0 && ii == 0)
						sb.append("|  X");
					else 
						sb.append("|  " + tavolaPitagorica[i][ii]);
				else if(tavolaPitagorica[i][ii] >= 10 || tavolaPitagorica[i][ii] < 0)
					if(tavolaPitagorica[i][ii] >= 100)
						sb.append("|" + tavolaPitagorica[i][ii]);
					else
						sb.append("| " + tavolaPitagorica[i][ii]);
		
			sb.append("|\n");
			
			for(int ii = 0; ii < n; ii++) 
				sb.append("----");
			
			sb.append("\n");
		}
			
		return sb.toString();		
	}
	
	public static void main(String[] args)
	{
		TavolaPitagorica tp = new TavolaPitagorica(10);
		System.out.println(tp.toString());
	}
	
}
