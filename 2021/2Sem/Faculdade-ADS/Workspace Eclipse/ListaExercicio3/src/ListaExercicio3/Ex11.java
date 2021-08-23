package ListaExercicio3;

public class Ex11 {

	public static void main(String[] args) {
		/*
		 * 11. Faça uma função que recebe a média final de um aluno por parâmetro e
		 * retorna o seu conceito, conforme a tabela abaixo: 
		 * Nota Conceito 
		 * de 0,0 a 4,9  | D 
		 * de 5,0 a 6,9  | C 
		 * de 7,0 a 8,9  | B 
		 * de 9,0 a 10,0 | A
		 */


		System.out.println(conceitoAluno(4.95));
	
	}
	
	static String conceitoAluno(double nota) {
		if(nota>=0.0 && nota<5) {
			return "D";
		}else if(nota>=5.0 && nota<7) {
			return "C";
		}else if(nota>=7.0 && nota<9) {
			return "B";
		}else if(nota>=9.0 && nota<=10.0) {
			return "A";
		}else {
			return "Nota inválida";
		}
	}
}

