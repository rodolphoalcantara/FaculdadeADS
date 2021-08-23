package ListaExercicio3;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * Fazer uma função que tem como parâmetros de entrada três números reais a, b,
		 * c e fornece como saída a maior raiz da equação do 2º grau: ax^2 + bx + c
		 * Nesta questão, você deverá utilizar a fórmula de Báskara. Se não houver
		 * raízes reais, a função deve retornar o número −1.
		 */
		
		System.out.println(maiorRaiz(1,-5,6));

	}
	
	static double maiorRaiz(int a, int b, int c) {
		
		double delta = (b*b)-(4*a*c);
		double x1 = ((-b)+Math.sqrt(delta))/(2*a);
		double x2 = ((-b)-Math.sqrt(delta))/(2*a);
		if(delta>=0) {
			if(x1>x2) {
				return x1;
			}else {
				return x2;
			}	
		}else {
			return -1;
		}
	}
	
	
	

}
