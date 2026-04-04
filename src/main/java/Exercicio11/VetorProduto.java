package Exercicio11;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class VetorProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criara o vetor produtos e um objeto produto
        Produto[] produtos = new Produto[5];
        Produto produto;
        String nome;
        int codigo;
        double preco;
        int j = 0;

        System.out.println("====================== Cadastro de Produtos =========================");
        System.out.println();
        System.out.println("Entre com os dados dos 5 produtos: ");
        System.out.println();

        for (int i = 0; i < produtos.length; i++){
            j = i + 1;
            System.out.print("Entre com o nome do produto[" + j +"]: " );
            nome = sc.nextLine();
            System.out.print("Entre com o codigo do produto[" + j +"]: " );
            codigo = sc.nextInt();
            System.out.print("Entre com o preço do produto[" + j +"]: " );
            preco = sc.nextDouble();
            sc.nextLine();

            produtos[i] = new Produto(nome, codigo, preco);
            System.out.println();

        }

        System.out.println("Exibindo o vetor de produtos");

        for (Produto prod : produtos){
            System.out.println(prod);
        }


        // Exibindo o produto mais caro
        nome = null;
        double maior =  0;

        for (Produto prod : produtos){
            if(prod.getPreço() > maior ){
                maior = prod.getPreço();
                nome = prod.getNome();
            }
        }

        System.out.println();
        System.out.println("Produto mais caro é " +  nome +  " valor = R$ " + maior);






    }
}
