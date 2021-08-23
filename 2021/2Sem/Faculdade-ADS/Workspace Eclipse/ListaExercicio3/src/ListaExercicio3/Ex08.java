package ListaExercicio3;

public class Ex08 {

	public static void main(String[] args) {
		/*8. Faça uma função que recebe por parâmetro um valor inteiro e positivo e retorna Verdadeiro caso o valor
		seja primo, e Falso, caso contrário. Para isso, você terá que usar o tipo de retorno boolean.*/
		
		System.out.println(isPrimo(5));
		
	}
	
	static boolean isPrimo(int n) {
		int contador =0;
		if(n>0) {
			for (int i = 1; i <= n; i++) {
				if(n%i == 0) {
					contador++;
				}
			}
		}
		if(contador>2) {
			return false;
		}else {
			return true;
		}
	}

}
