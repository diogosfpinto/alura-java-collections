package br.com.alura;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int numeroMatricula;


    public Aluno(String nome, int numeroMatricula) {
        if(nome==null){
            throw new NullPointerException("Nome não pode ser nulo.");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }


    /** Sobreescreve o método equals para comparar se um objeto é igual ao outro pelo nome e número de matrícula.
     * gerado pelo própria  IDE.
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return numeroMatricula == aluno.numeroMatricula && Objects.equals(nome, aluno.nome);
    }

    /** Sobreecreve o método hashCode da classe Object para calcular o hashCode baseado nos campos definidos.
     * Extremamente recomendado quando se sobreescreve o método equals.
     * */
    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroMatricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula=" + numeroMatricula +
                '}';
    }
}
