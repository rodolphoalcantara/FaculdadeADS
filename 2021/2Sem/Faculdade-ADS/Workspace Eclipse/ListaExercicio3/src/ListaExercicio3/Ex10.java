package ListaExercicio3;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 10. Faça uma função que recebe a idade de um nadador por parâmetro e retorna
		 * , também por parâmetro, a categoria desse nadador (tipo String) de acordo com
		 * a tabela abaixo: 
		 * Idade Categoria 
		 * 5 a 7 anos Infantil A 
		 * 8 a 10 anos Infantil B
		 * 11-13 anos Juvenil A 
		 * 14-17 anos Juvenil B 
		 * Maiores de 18 anos (inclusive) Adulto
		 */

		System.out.println(categoriaNadador(18));
	
	}
	
	static String categoriaNadador(int idade) {
		if(idade>=5 && idade<=7) {
			return "Infantil A";
		}else if(idade>=8 && idade<=10) {
			return "Infantil B";
		}else if(idade>=11 && idade<=13) {
			return "Juvenil A";
		}else if(idade>=14 && idade<=17) {
			return "Juvenil B";
		}else if(idade >=18) {
			return "Adulto";
		}else {
		return "Sem categoria";
		}
	}
}

