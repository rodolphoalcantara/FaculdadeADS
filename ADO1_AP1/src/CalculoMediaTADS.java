import java.util.Scanner;

public class CalculoMediaTADS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //criei um objeto do tipo Scanner chamado "teclado
        String nomeAluno;
        double n1, n2, media;
        double P1 = 0.4, P2 = 0.6; //P1 == 0.4 e P2 0.6
        int faltas, TOTAL_FALTAS = 18;
        
        System.out.println("*--* Cálculo Média Algoritmos - TADS *--*");
        
        System.out.println("Nome: ");
        nomeAluno = teclado.next();
        
        System.out.println("N1: ");
        n1 = teclado.nextDouble();
        
        System.out.println("N2: ");
        n2 = teclado.nextDouble();
        
        System.out.println("Faltas: ");
        faltas = teclado.nextInt();
        
        media = (n1 * P1) + (n2 * P2);
        
        if((media >= 6.0) && (faltas <= TOTAL_FALTAS)){
            System.out.println(nomeAluno + ", você está aprovado com média " + media);
        }else{
        	if(media < 6.0 && faltas > TOTAL_FALTAS){
        		System.out.println(nomeAluno + ", você foi reprovado por nota e falta.");
        		System.out.println("Total de faltas: " + faltas);
        		System.out.println("Sua média foi " + media);
        	}else if(media < 6.0) {
        		System.out.println(nomeAluno + ", você foi reprovado por nota. Sua média foi " + media);
        	}else {
        		System.out.println(nomeAluno + ", você foi reprovado por falta. Total de faltas: " + faltas);
        	}

        }
        
        //TO DO -> saber o motivo ao qual o aluno foi reprovado (Ex. nota, nota e falta ou apenas por faltas)
    }

}