import java.util.Scanner;
public class ExercicioMenuJogo {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		boolean finalizou = false;
		
		do {
			System.out.println();
			System.out.println("1 - Instru��es.");
			System.out.println("2 - Jogar");
			System.out.println("3 - Cr�ditos.");
			System.out.println("4 - Sair");
			
			System.out.println("Escolha uma das Op��es acima:");
			int escolha = entrada.nextInt();
		
		
			switch(escolha) {
			case 1:
				System.out.println("Voc� acessou a op��o Instru��es.");
				break;
			case 2:
				System.out.println("Voc� escolheu come�ar o jogo.");
				break;
			case 3:
				System.out.println("Este c�digo foi escrito por Rodolpho Alc�ntara!");
				break;
			case 4:
				System.out.println("Voc� escolheu sair!");
				finalizou = true;
				break;
			default:
				System.out.println("Op��o Inv�lida!!!");
			}
		}while(!finalizou);
		
		System.out.println("Finalizando aplica��o...");
		System.out.println("Obrigado!!!");

	}

}
