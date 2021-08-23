import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int n1;
		int n2;
		
		System.out.print("N1: ");
		n1 = entrada.nextInt();
		System.out.print("N2: ");
		n2 = entrada.nextInt();
		
		if (n1 != n2) {
		
			if (n1 > n2) {
				System.out.println(n1 + " é maior que " + n2);
			}else {
				System.out.println(n2 + " é maior que " + n1);
			}
		}else {
			System.out.println("Os números são iguais !");
		}
		
		entrada.close();
				
	}

}