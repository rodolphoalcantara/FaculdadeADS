
public class Ex08 {
	/*
	 * 8. Calcular e mostrar a média aritmética dos números pares compreendidos
	 * entre 13 e 73. Utilize o laço que lhe for mais conveniente.
	 */

	public static void main(String[] args) {
		int soma = 0, qnt= 0; 
		double media;
		
		for (int i = 13; i < 73; i++) {
			if (i%2==0) {
				soma +=i;
				qnt++;
			}
			
		}
		
		media = soma/qnt;
		System.out.println("A média dos números é: "+media);
				
	}	
}


