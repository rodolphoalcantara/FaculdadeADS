package ListaDeExercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	
		/* 		Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, 
		 *		tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja abaixo alguns exemplos. Não fixe esses valores no código. 
		 * 		Você pode usá-los para TESTAR seu algoritmo:
		*/

		
		Scanner entrada = new Scanner(System.in);
		
		int horaInicial, horaFinal, resultado;
		
		System.out.println("Duração do Jogo!");
		
		System.out.println("Insira a hora inicial do jogo: ");
		horaInicial = entrada.nextInt();
		System.out.println("Insira a hora final do jogo: ");
		horaFinal = entrada.nextInt();
		
		if ((horaInicial >= 0 && horaInicial <=24) && (horaFinal>=0 && horaFinal<=24)) {
		
			if(horaFinal == horaInicial) {
				System.out.println("O Jogo durou 24 horas!");
			}else if(horaFinal < horaInicial) {
				resultado = (horaFinal+24)-horaInicial;
				System.out.println("O jogo durou "+resultado+" hora(s)!");
			}else {
				resultado = horaFinal - horaInicial;
				System.out.println("O jogo durou "+resultado+" hora(s)!");
			}
		
		}else {
			System.out.println("Hora Inválida!");
		}
		
		
		entrada.close();
		
	}

}
