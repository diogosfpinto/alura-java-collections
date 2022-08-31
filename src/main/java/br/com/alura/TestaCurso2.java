package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Java 1", 50));
        javaColecoes.adiciona(new Aula("Java 3", 50));
        javaColecoes.adiciona(new Aula("Java 2", 50));
        System.out.println(javaColecoes.getAulas());

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);
    }
}
