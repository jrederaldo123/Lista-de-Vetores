package Exercicio01;

import java.util.Scanner;

public class SomaDeElementos {
    public static void main(String[] args) {
        // Declarando o vetor de inteiros vet

        int[] vet = new int[10];

        // Preparando a entrada do usuário

        Scanner sc = new Scanner(System.in);

        // Solicitando ao usuário para digitar dez números inteiros aleatório
        System.out.println("================== Soma de elementos do Vetor ===============");
        System.out.println();
        System.out.println("Entre com os 10 elementos inteiros  do vetor: ");
        System.out.println();

        int j= 0;
        for (int i = 0; i < vet.length; i++) {
            j = i +1;
            System.out.print("Entre com o elemento[" + j +"]: ");
            vet[i] = sc.nextInt();
        }

        // somando os elementos do vetor vet

        int soma = 0;

        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        // Exibindo o vetor vet
        System.out.print("Imprimindo o vetor: ");
        j= 0;

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }

        System.out.println();
        // Imprimido  a soma
        System.out.println("Soma  = " +  soma);

        sc.close();
    }
}
