package exercicios;

public class exercicio3 {

	/*
	 * Temos vários coelhos e cada coelho tem duas orelhas grandes e flexíveis.
	 * Queremos calcular o número totalde orelhas em todos os coelhos de forma recursiva (sem loops ou multiplicação).
	 * Criar uma função recursiva quereceba um número N representando o número de coelhos e retorne a número total de orelhas.
	 * Exemplos:
	 * orelhasCoelho(0)→0
	 * orelhasCoelho(1)→2
	 * orelhasCoelho(2)→4
	*/
		
	public static void main(String[] args) {
		
		System.out.println(orelhasCoelho(0));
		System.out.println(orelhasCoelho(1));
		System.out.println(orelhasCoelho(2));
		
	}
	
	public static int orelhasCoelho(int n) {
		
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 2;
		}
		
		return 2 + orelhasCoelho(n-1);
	}
}