import java.util.Scanner;
public class Ex2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Como podemos definir o grau de um polinomio?");
		System.out.println("	A) Somando os termos.");
		System.out.println("	B) Multiplicando os monomios.");
		System.out.println("	C) Multiplicando os expoentes dos termos");
		System.out.println("	D) Somando os expoentes dos termos, a maior soma será o grau.");
		System.out.println("	E) Multiplicando os elementos de cada termo, o maior produto será o grau.");
		System.out.println("Digite a letra correspondente a alternativa correta:");
		
		String alternativa = entrada.next();
		
		switch(alternativa.toUpperCase()) {
		case "A":
			System.out.println("Resposta incorreta !");
			break;
		case "B":
			System.out.println("Resposta incorreta !");
			break;
		case "C":
			System.out.println("Resposta incorreta !");
			break;
		case "D":
			System.out.println("Resposta correta !");
			break;
		case "E":
			System.out.println("Resposta incorreta !");
			break;
		default:
			System.out.println("Alternativa não foi selecionada corretamente.");
			
			
		}
	}
}
