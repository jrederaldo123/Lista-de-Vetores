package Exercicio02;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        // preparando a entrada

        Scanner sc = new Scanner(System.in);

        // criando o vetor

        int[] vetor = new int[15];

        System.out.println("============== Indicar menor e maior elemento do vetor" +
                " e suas resapectivas posições ===========================");
        System.out.println();
        System.out.println("Favor digitar os 15 elementos do vetor:");
        System.out.println();


        // Entrando com os 15 elementos
        int j = 0;
        for (int i = 0; i < vetor.length; i++) {
            j = i + 1;
            System.out.print("Entre com o elemento[" + j +"]: ");
            vetor[i] = sc.nextInt();
        }

        int maior = 0;
        int menor = 0;
        int posicaoMenor = 0;
        int posicaoMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                posicaoMenor = i +1;
            }

            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i + 1;
            }
        }


       // Imprimindo os dados do vetor
        System.out.println("Imprimindo o vetor:");
        j = 0;
        for (int i = 0; i < vetor.length; i++) {
            j = i + 1;
            System.out.println("Elemento[" + j +"]: " + vetor[i]);
        }

        // imprimindo o menor e o maior  valor e suas respectivas posições
        System.out.println("Menor  elemento = " + menor + " Posição = " + posicaoMenor);
        System.out.println("Maior  elemento = " + maior + " Posição = " + posicaoMaior);

        sc.close();
    }
}
