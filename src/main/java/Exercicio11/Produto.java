package Exercicio11;

public class Produto {
    private String nome;
    private int codigo;
    private double preço;

    public Produto(String nome, int codigo, double preco) {
        setNome(nome);
        setCodigo(codigo);
        setPreço(preco);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preço=" + preço +
                '}';
    }
}
