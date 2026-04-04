package Exercicio12;

public class Aluno {

    // atributos
    private String matricula;
    private double notaFinal;

    public Aluno(String matricula, double notaFinal) {
        setMatricula(matricula);
        setNotaFinal(notaFinal);
    }

    // Métodos Gets e Sets
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
            this.matricula = Validador.validarString(matricula, "Matricula");
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = Validador.validarNumeroNaoNegativo(notaFinal, "Nota Final");
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
