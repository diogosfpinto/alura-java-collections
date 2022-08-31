package br.com.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 50));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 40));

        Aluno a1 = new Aluno("Rodrigo Turini", 346732);
        Aluno a2 = new Aluno("Alberto Silveira", 54389);
        Aluno a3 = new Aluno("Paulo Capitanio", 595381);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: "+javaColecoes.getAlunos());

        System.out.println(a1.getNome()+" está matriculado no curso "+javaColecoes.getNome()+"?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 3467321);

        System.out.println("turini está matriculado no curso "+javaColecoes.getNome()+"?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("a1 é equals turini?");
        System.out.println(a1.equals(turini));
        System.out.println("hashcode a1: "+a1.hashCode());
        System.out.println("haschcode turini: "+turini.hashCode());
        System.out.println("a1 hashcode é == turini hashcode?");
        System.out.println(a1.hashCode() == turini.hashCode());

    }
}
