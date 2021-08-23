import java.util.Random;
import java.util.ArrayList;



public class JogandoDados {

	//Algoritmo que lança um dado de 6 faces e calcula a porcentagem de cada numero obtido.
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random gerador = new Random();
		double cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0;
		
		for(int i = 0; i < 1000000; i++) {
			lista.add(gerador.nextInt(6)+1);
		}
		
		for(int i = 0; i < lista.size();i++) {
			
			switch(lista.get(i)) {
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			case 4:
				cont4++;
				break;
			case 5:
				cont5++;
				break;
			case 6:
				cont6++;
				break;
			
			}
			
		}
			
		  System.out.println("A porcentagem dos números das rolagens dos dados é:");
		  System.out.println("Número 1: " + (cont1/lista.size())*100 + "% !");
		  System.out.println("Número 2: " + (cont2/lista.size())*100 + "% !");
		  System.out.println("Número 3: " + (cont3/lista.size())*100 + "% !");
		  System.out.println("Número 4: " + (cont4/lista.size())*100 + "% !");
		  System.out.println("Número 5: " + (cont5/lista.size())*100 + "% !");
		  System.out.println("Número 6: " + (cont6/lista.size())*100 + "% !");
		 
		  
	}
}
