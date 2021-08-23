import java.util.Scanner;

public class exercicio6 {
	
	/*
	 * 
	 * Alunos: Aurélio Bispo dos Santos, Gessione Freitas de Souza, Rodolpho Ramos de Alcântara
	 * 
	 * A multiplicação Russa consiste em:
	 * 
	 * a)  Escrever os números A e B, que se deseja multiplicar na parte superior das colunas;
	 * b)  Dividir A por 2, sucessivamente, ignorando o resto até chegar à unidade, escrever os resultados da coluna A;
	 * c)  Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, escrever os resultados sucessivos na colunaB;
	 * d)  Somar todos os números da coluna B que estejam ao lado de um número ímpar da coluna A.
	 * 
	 * Criar uma função recursiva que permita fazer à multiplicação russa de 2 entradas
	 * */
	
	
    public static void main(String[] args) {
        int a;
        int b;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para A:");
        a = in.nextInt();
        System.out.println("Digite um valor inteiro para B:");
        b = in.nextInt();

        multiplicacaoRussa(a,b,0);
    }

    private static void multiplicacaoRussa(int a, int b, int result) {
        if(a>=1){
            if (a % 2 == 0) {
                a = a / 2;
                b = b*2;
            }else{
                result += b;
                b = b*2;
                a = (a-1)/2;
            }
            multiplicacaoRussa(a,b,result);
        }else{
            System.out.println(result);
        }
    }
}
