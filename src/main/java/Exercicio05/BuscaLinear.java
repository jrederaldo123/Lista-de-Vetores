package Exercicio05;

import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o vetor

        int[] numeros = new int[10];
        int numero = 0;
        int posicao = 0;
        int j = 0;

        // alimentando o vetor

        System.out.println("Entre com os 10 numeros do vetor: ");
        System.out.println();

        for(int i = 0; i < numeros.length; i++){
            j = i + 1;
            System.out.print("Entre com o elemento[" + j + "]: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();


        // exibindo os dados do vetor

        System.out.println("Exibindo os dados do vetor:");
        System.out.println();

        for(int i = 0; i < numeros.length; i++){
            j = i + 1;
            System.out.println("numero[" + j + "] = " + numeros[i]);
        }
        System.out.println();

        System.out.print("Qual o numero que você quer procurar: ");
        numero = sc.nextInt();

        j = 0;
        for(int i = 0; i < numeros.length; i++){
            j = i + 1;
            if(numeros[i] == numero) {
                System.out.println("O numero existe e está na posição numero[" + j+  "]");
            }
        }
        sc.close();
    }
}
