package br.com.alura;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Java 1", 50));
        System.out.println(javaColecoes.getAulas());
    }
}
