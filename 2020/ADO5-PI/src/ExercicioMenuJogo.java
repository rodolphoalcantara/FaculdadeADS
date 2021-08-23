import java.util.Scanner;
public class ExercicioMenuJogo {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		boolean finalizou = false;
		
		do {
			System.out.println();
			System.out.println("1 - Instruções.");
			System.out.println("2 - Jogar");
			System.out.println("3 - Créditos.");
			System.out.println("4 - Sair");
			
			System.out.println("Escolha uma das Opções acima:");
			int escolha = entrada.nextInt();
		
		
			switch(escolha) {
			case 1:
				System.out.println("Você acessou a opção Instruções.");
				break;
			case 2:
				System.out.println("Você escolheu começar o jogo.");
				break;
			case 3:
				System.out.println("Este código foi escrito por Rodolpho Alcântara!");
				break;
			case 4:
				System.out.println("Você escolheu sair!");
				finalizou = true;
				break;
			default:
				System.out.println("Opção Inválida!!!");
			}
		}while(!finalizou);
		
		System.out.println("Finalizando aplicação...");
		System.out.println("Obrigado!!!");

	}

}
