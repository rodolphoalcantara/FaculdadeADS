package ListaExercicio3;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 6. Modificar a função do Exercício 5 da seguinte forma: além dos parâmetros
		 * de entrada reais a, b, c, um quarto parâmetro d deve ser adicionado. Esse
		 * parâmetro poderá ter dois valores: 1 ou 2. Ele será responsável para decidir
		 * se a saída da função vai ser a maior ou a menor raiz (no caso de raízes
		 * iguais, considere a maior raiz). Considere que 1 serve para obter a maior
		 * raiz e 2 para obter a menor raiz. Novamente, se não houver raízes reais, a
		 * função deve retornar o número −1.
		 */

		
		System.out.println(maiorRaiz(1,-5,6,2));

	}
	
	static double maiorRaiz(int a, int b, int c, int d) {
		
		double delta = (b*b)-(4*a*c);
		double x1 = ((-b)+Math.sqrt(delta))/(2*a);
		double x2 = ((-b)-Math.sqrt(delta))/(2*a);
		if(delta>=0) {
			if(d==1) {
				if(x1>x2) {
					return x1;
				}else {
					return x2;
				}				
			}else {
				if(x1<x2) {
					return x1;
				}else {
					return x2;
				}
			}
		}else {
			return -1;
		}
	}
	
	
	

}
