package Exercicio06;

import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("============== Vetores de números pare e impares ========================");
        System.out.println();
        System.out.println("Favor digitar os 20 numeros inteiros:");
        System.out.println();

        int[] numeros = new int[20];
        int[] impares = new int[20];
        int[] pares = new int[20];
        int j = 0;

        // solicitando os 20 numeros  ao usuário

        for (int i = 0; i < numeros.length; i++){
            j = i + 1;
            System.out.print("Entre com o numero[" + j + "]: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();

        // exibindo os 20 numeros
        System.out.println("Exibindo os elementos do vetor:");
        System.out.println();

        for (int i = 0; i < numeros.length; i++){
            j = i + 1;
            System.out.println("Numero[" + j + "]: " + numeros[i]);
        }
        System.out.println();

        int x = 0;
        int z = 0;

        // populando os vetores pares e impares extraindo os dados do vetor numeros

        for (int i = 0; i < numeros.length; i++){

            if (numeros[i] % 2 == 0) {
                pares[x] = numeros[i];
                x++;
            } else {
                impares[z] = numeros[i];
                z++;
            }
        }

        // exibindo os numeros do vetor pares e do vetor impares
        System.out.println("Exibindo os elementos do vetor de números pares:");
        System.out.println();

        j = 0;

        for (int i = 0; i < pares.length; i++){
            j = i + 1;
            System.out.println("Par[" + j + "]: " + pares[i]);
        }

        j = 0;

        System.out.println();
        System.out.println("Exibindo os elementos do vetor de números impares:");
        System.out.println();

        for (int i = 0; i < impares.length; i++){
            j = i + 1;
            System.out.println("Impar[" + j + "]: " + impares[i]);
        }
        sc.close();
    }
}
