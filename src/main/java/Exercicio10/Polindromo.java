package Exercicio10;

public class Polindromo {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 3, 2, 1};

        System.out.println("Dados do vetor: ");
        for (int v:vetor){
            System.out.println(v);
        }
        boolean palindromo = true;
        for(int i = 0; i < vetor.length / 2; i++) {
            if(vetor[i] != vetor[vetor.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        System.out.println();
        System.out.println(palindromo ? "É palíndromo" : "Não é palíndromo");
    }

}
