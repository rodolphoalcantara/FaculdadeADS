
public class Ex3 {
	
	
	
	
	public static void main(String[] args) {
		/*
		 * 3. Crie uma função para unir dois vetores de mesmo tamanho e mesmo tipo em um
		 * terceiro vetor com dobro do tamanho.
		 */
		/*
		 * dois vetores com mesmo tipo (string ou int ou double ...) e mesmo tamanho(verificar SE tem o mesmo tamanho)
		 * terceito vetor com dobro do tamanho dos anteriores (dobro do primeiro vetor ou do segundo)
		 * juntar os valores do primeiro com os valores do segundo no terceiro vetor. 
		 * 
		 * 
		 * verificar SE tem o mesmo tamanho
		 * juntar os valores
		 * 
		 * 
		 * */
		
		int[] vetorA = new int[] {2,3,8,10,9,10};
		int[] vetorB = new int[] {10,8,3,2,10,9};
		int[] vetorC = new int[vetorA.length*2];
		
		juntarVetores(vetorA, vetorB, vetorC);
			
	}
	
	static void juntarVetores(int[] vetorA, int[] vetorB, int[] vetorC) {
		if(vetorA.length == vetorB.length) {
			
			for(int i = 0;i < vetorA.length;i++) {
				vetorC[i] = vetorA[i];
				System.out.println(vetorC[i]);
			}
			for(int i = 0; i < vetorB.length;i++) {
				vetorC[vetorA.length+i] = vetorB[i];
				System.out.println(vetorC[vetorA.length+i]);
			}
			
		}else {
			System.out.println("Os vetores não tem o mesmo tamanho.");
		}
		
		
	}
	
	
	
	
}
