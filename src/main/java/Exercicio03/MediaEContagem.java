package Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class MediaEContagem {
    public static void main(String[] args) {

        // preparando numeros de ponto de funcão
        Locale.setDefault(Locale.US);

        // Preparando a entrada de dados
        Scanner sc = new Scanner(System.in);

        // Criando o vetor notas

        double[] notas = new double[20];
        double media = 0;
        double soma = 0;
        double total = 0;

        System.out.println("====================== Notas dos Alunos =============================");
        System.out.println();
        System.out.println("Favor digitar as notas dos 20 alunos:");

        // Recebendo as notas dos 20 alunos
        int j = 0;
        for (int i = 0; i < notas.length; i++) {
            j = i + 1;
            System.out.print("Entre com a nota do aluno[" + j + "]: ");
            notas[i] = sc.nextDouble();
        }

        // mostrando  as notas dos 20 alunos

        j = 0;

        for (int i = 0; i < notas.length; i++) {
            j = i + 1;
            System.out.println("Aluno[" + j + "]: " + notas[i]);
        }

        // calculando a média das notas dos 20 alunos

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        media  = soma/ (double) notas.length;

        // contando quantos alunos tiveram nota acima da media da turma

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >= media){
                total ++;
            }
        }

        System.out.print(total + " alunos tiveram nota superior a media = " + media);
        sc.close();
    }
}
