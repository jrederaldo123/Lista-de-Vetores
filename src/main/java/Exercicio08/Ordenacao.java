package Exercicio08;

import java.util.Scanner;

public class Ordenacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando o vetor

        int[] numeros = new int[10];

        System.out.println("===================== Ordenação =======================");
        System.out.println();
        System.out.println("Favor digitar os 10 numeros para ser ordenado: ");
        System.out.println();

        // populando o vetor

        int j = 0;
        for (int i = 0; i< numeros.length; i++){
            j = i + 1;
            System.out.print("Entre com o valor do Numero[" + j + "]: ");
            numeros[i] = sc.nextInt();
        }

        // Exibindo dados do vetor numeros

        System.out.println();
        System.out.println("Exibindo os 10 numeros  do vetor para ser ordenado: ");
        System.out.println();

        j = 0;
        for (int i = 0; i< numeros.length; i++){
            j = i + 1;
            System.out.println("Numero[" + j + "]: " + numeros[i]);
        }

        // ordenando o vetor numeros


        for (int i = 0; i < numeros.length - 1; i++) {
            for (int x = 0; x < numeros.length - 1 - i; x++) {
                if (numeros[x] > numeros[x + 1]) {
                    // troca
                    int temp = numeros[x];
                    numeros[x] = numeros[x + 1];
                    numeros[x + 1] = temp;
                }
            }
        }

        // imprimir resultado
        System.out.println();
        System.out.println("Segue o  vetor numeros ordenado:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
