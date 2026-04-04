package Exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno[] alunos = new Aluno[10];
        String  matricula;
        double notaFinal;
        Aluno aluno;

        System.out.println("======================= Caderneta de Alunos ===================");
        System.out.println();
        System.out.println("Entre com o dados dos 10 alunos: ");
        System.out.println();

        int j  = 0 ;
        for (int i = 0; i < alunos.length; i++){
            j = i + 1;
            System.out.print("Entre com a matricula do aluno[" + j + "]: ");
            matricula = sc.nextLine();

            System.out.print("Entre com a nota final do aluno[" + j + "]: ");
            notaFinal = sc.nextDouble();
            aluno = new Aluno(matricula, notaFinal);
            alunos[i] = aluno;
            sc.nextLine();

        }

        System.out.println();
        System.out.println("Lista dos alunos da classe:");
        System.out.println();
        for (int i = 0; i < alunos.length; i++){
            j = i + 1;
            System.out.println("Matricula do aluno[" + j + "]: " + alunos[i].getMatricula());
            System.out.println("Nota final do aluno[" + j + "]: " + alunos[i].getNotaFinal());
            System.out.println();
        }

        System.out.println("Lista dos alunos da classe com media superio a 7.0 :");
        System.out.println();
        for (int i = 0; i < alunos.length; i++){
            j = i + 1;
            if(alunos[i].getNotaFinal() > 7) {
                System.out.println("Matricula do aluno[" + j + "]: " + alunos[i].getMatricula());
                System.out.println("Nota final do aluno[" + j + "]: " + alunos[i].getNotaFinal());
            }
        }


    }



}
