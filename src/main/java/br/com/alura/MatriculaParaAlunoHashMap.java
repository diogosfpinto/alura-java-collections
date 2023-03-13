package br.com.alura;

public class MatriculaParaAlunoHashMap {

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

        Aluno aluno = javaColecoes.buscaMatriculado(54389);
        System.out.println(aluno);

    }
}
