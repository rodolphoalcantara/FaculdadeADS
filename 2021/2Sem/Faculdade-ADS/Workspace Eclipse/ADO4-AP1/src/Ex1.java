
public class Ex1 {
	
	/*
	 * 1. Faça uma função que copie o conteúdo de um vetor em um segundo vetor.
	 */
	
	/*
	 * Lista de Compras: 
	 * 0. Ovos; 
	 * 1. Leite; 
	 * 2. Pão; 
	 * 3. Detergente; 
	 * 4. Açucar;
	 */
	
	public static void main(String[] args) {
		String[] listaDeComprasOriginal = new String[] {"Ovos","Leite","Pão","Detergente","Açucar"};
		
		String[] listaDeComprasCopia = new String[listaDeComprasOriginal.length];
		
		
		copiaVetorString(listaDeComprasOriginal, listaDeComprasCopia);
	}
	
	static void copiaVetorString(String[] Original, String[] Copia) {
		for(int indice = 0; indice < Original.length; indice++) {
			Copia[indice] = Original[indice];	
		}
	}
}
