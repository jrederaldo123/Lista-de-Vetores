package Exercicio09;

public class Intersecao {
    public static void main(String[] args) {
        int[] v1 = {1, 2, 3, 4, 5};
        int[] v2 = {3, 4, 5, 6, 7};

        System.out.println("Dados do vetor v1: ");

        for (int v:v1){
            System.out.println(v);
        }

        System.out.println("Dados do vetor v2: ");

        for (int v:v2){
            System.out.println(v);
        }


        int[] inter = new int[5];
        int k = 0;
        for (int i = 0; i < v1.length; i++) {
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    inter[k++] = v1[i];
                    break;
                }
            }
        }
        System.out.println();
        System.out.print("Intersecção: ");
        for (int i = 0; i < k; i++) System.out.print(inter[i] + " ");
    }
}
