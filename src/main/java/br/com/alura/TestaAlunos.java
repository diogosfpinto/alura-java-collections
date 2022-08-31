package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        //Set - conjunto

        Set<String> alunos = new HashSet<>();

        //Por que usar SEt?
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Renan Steban");
        alunos.add("Mauricio Aniche");
        alunos.add("Renan Saggio");
        alunos.add("Sergio Lopes");
        //Em Set, ele trata casos em que os elementos não podem repetir.
        alunos.add("Sergio Lopes");

        //Ordem dos itens não são levados em conta. Pois os elementos não tem garantia de ordem.
        System.out.println(alunos);

        //Para metodos contains , o Set é muito mais veloz em encontrar itens pois, usa algoritmos de tabela de espalhamento.
        boolean itemEstaNaLista = alunos.contains("Mauricio Aniche");
        System.out.println(itemEstaNaLista);

        for (String aluno : alunos
             ) {
            System.out.println(aluno);
        }
    }
}
