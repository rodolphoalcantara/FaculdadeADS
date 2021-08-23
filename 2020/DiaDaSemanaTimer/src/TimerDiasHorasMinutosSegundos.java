import java.util.Scanner;

public class TimerDiasHorasMinutosSegundos {
	/*
	 * 1) hh:mm:ss.
	 * 2) Mensagem de ALARME 8:00:00.
	 * 3) ADO - Adicionar o dia da semana no código abaixo
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String dStr;
		int dA = 0, hA, mA, sA;
		int flag = 0;

		do {
			System.out.println("Dia: ");
			dStr = input.next();
			switch (dStr.toUpperCase()) {
			case "DOMINGO":
				dA = 0;
				break;
			case "SEGUNDA":
			case "SEGUNDA-FEIRA":
			case "SEGUNDA FEIRA":
				dA = 1;
				break;
			case "TERÇA":
			case "TERÇA-FEIRA":
			case "TERÇA FEIRA":
				dA = 2;
				break;
			case "QUARTA":
			case "QUARTA-FEIRA":
			case "QUARTA FEIRA":
				dA = 3;
				break;
			case "QUINTA":
			case "QUINTA-FEIRA":
			case "QUINTA FEIRA":
				dA = 4;
				break;
			case "SEXTA":
			case "SEXTA-FEIRA":
			case "SEXTA FEIRA":
				dA = 5;
				break;
			case "SABADO":
			case "SÁBADO":
				dA = 6;
				break;
			default:
				System.out.println("Dia inválido. Timer será incializado como Domingo.");

			}
			System.out.println("Hora: ");
			hA = input.nextInt();
			System.out.println("Minuto: ");
			mA = input.nextInt();
			System.out.println("Segundo: ");
			sA = input.nextInt();
			for (int d = 0; d <= 6; d++) {
				switch (d) {
				case 0:
					System.out.println("Domingo");
					break;
				case 1:
					System.out.println("Segunda-Feira");
					break;
				case 2:
					System.out.println("Terça-Feira");
					break;
				case 3:
					System.out.println("Quarta-Feira");
					break;
				case 4:
					System.out.println("Quinta-Feira");
					break;
				case 5:
					System.out.println("Sexta-Feira");
					break;
				case 6:
					System.out.println("Sábado");
					break;
				}
				for (int h = 0; h <= 23; h++) {
					for (int m = 0; m <= 59; m++) {
						for (int s = 0; s <= 59; s++) {
							System.out.printf("%d:%d:%d \n", h, m, s);
							if ((d == dA) && (h == hA) && (m == mA) && (s == sA)) {
								System.out.println("ALARME");
								break;
							}
						}
						if ((d == dA) && (h == hA) && (m == mA)) {
							break;
						}

					}
					if ((d == dA) && (h == hA)) {
						break;
					}
				}
				if (d == dA) {
					break;
				}
			}
			System.out.println("1. CONTINUAR");
			flag = input.nextInt();
		} while (flag == 1);
		
		input.close();

	}
}
