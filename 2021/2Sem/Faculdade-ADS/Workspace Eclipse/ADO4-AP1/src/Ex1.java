
public class Ex1 {
	
	/*
	 * 1. Fa�a uma fun��o que copie o conte�do de um vetor em um segundo vetor.
	 */
	
	/*
	 * Lista de Compras: 
	 * 0. Ovos; 
	 * 1. Leite; 
	 * 2. P�o; 
	 * 3. Detergente; 
	 * 4. A�ucar;
	 */
	
	public static void main(String[] args) {
		String[] listaDeComprasOriginal = new String[] {"Ovos","Leite","P�o","Detergente","A�ucar"};
		
		String[] listaDeComprasCopia = new String[listaDeComprasOriginal.length];
		
		
		copiaVetorString(listaDeComprasOriginal, listaDeComprasCopia);
	}
	
	static void copiaVetorString(String[] Original, String[] Copia) {
		for(int indice = 0; indice < Original.length; indice++) {
			Copia[indice] = Original[indice];	
		}
	}
}
