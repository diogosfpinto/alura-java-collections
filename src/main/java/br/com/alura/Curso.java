package br.com.alura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas;

    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    private List<Aula> getAulasInstance(){
        if(aulas == null){
            aulas = new LinkedList<Aula>();
        }
        return aulas;
    }

    public void adiciona(Aula aula){
        getAulasInstance().add(aula);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public int getTempoTotal(){
        int tempoAulas = 0;

        for(Aula aula : getAulas()){
            tempoAulas = tempoAulas + aula.getTempo();
        }

        return tempoAulas;
    }

    @Override
    public String toString(){
        return "[Curso: "+nome+", tempo total: "+getTempoTotal()+", aulas: ["+aulas+"]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {

        return alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        return matriculaParaAluno.get(numero);
    }
}
