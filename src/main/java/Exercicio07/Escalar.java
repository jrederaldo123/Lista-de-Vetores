package Exercicio07;

import java.util.Scanner;

public class Escalar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================== Sistema para Multiplicar escala por Vetor ===================");
        System.out.println();

        // criando os artefatos necessários
        int[] numeros  =  new int[10];
        int[] produtos  =  new int[10];
        int j = 0;
        int valor = 0;

        // populando o vetor numeros

        System.out.println("Entre com os 10 números inteiros:");
        System.out.println();

        for (int  i = 0; i< numeros.length; i ++){
            j = i +1;
            System.out.print("Entre com o numero[" + j  + "]: ");
            numeros[i] = sc.nextInt();;
        }

        // exibindo os dados do vetor numeros
        System.out.println();
        System.out.println("Exibindo os numeros do vetor numeros:");
        System.out.println();

        for (int  i = 0; i< numeros.length; i ++){
            j = i +1;
            System.out.println("numero[" + j  + "]: " +  numeros[i]);
        }

        System.out.println();
        System.out.print("Entre com o valor que você deseja multripicar o vetor numeros: ");
        valor = sc.nextInt();

        for (int  i = 0; i< numeros.length; i ++){
            produtos[i] = numeros[i] * valor;
        }

        // exibindo os dados do vetor numeros
        System.out.println();
        System.out.println("Exibindo os numeros do vetor produtos:");
        System.out.println();

        j = 0;

        for (int  i = 0; i< produtos.length; i ++){
            j = i +1;
            System.out.println("produtos[" + j  + "]: " + produtos[i]);
        }



        sc.close();
    }
}
