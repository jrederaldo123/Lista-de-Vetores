package Exercicio04;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class InversaoVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criando os vetor palava e palavraInversa

        char[] palavra = new char[8];
        char[] palavraInversa = new char[8];

        int j = 0;

        // Alimentando o vetor palavra

        System.out.println("===================== Programa para inverter uma palavra ==================");

        System.out.println("Entre com os caracteres da palavra:");

        for (int i = 0; i < palavra.length; i++){
             j = i + 1;
            System.out.print("Entre com o caracter[" + j + "]: ");
            palavra[i] = sc.nextLine().charAt(0);
        }

        // exibindo os dados do vetor

        System.out.println("Exibindo os dados do vetor: ");
        System.out.println();

        for (int i = 0; i < palavra.length; i++){
            System.out.print(palavra[i]);
        }

        System.out.println();

        // recebendo os dados do vetor de forma inversa

        System.out.println("Exibindo os dados do vetor invertido: ");
        System.out.println();

        j = 0;
        for (int i = 7; i >= 0; i--){
            palavraInversa[j] = palavra[i];
            j += 1;
        }

        for (int i = 0; i < palavra.length; i++){
            System.out.print(palavraInversa[i]);
        }







        sc.close();
    }
}
