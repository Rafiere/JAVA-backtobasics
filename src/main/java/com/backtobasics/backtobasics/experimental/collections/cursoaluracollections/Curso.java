package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import lombok.Getter;

import java.util.*;

@Getter
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>(); //É recomendado sempre utilizarmos "List" ao invés de "ArrayList" para diminuirmos o acoplamento, pois o "List" é uma interface.

    private Set<Aluno> alunos = new HashSet<>();

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    /**
     * A diferença entre uma LinkedList e o ArrayList é a performance em algumas
     * operações. A ArrayList utiliza um "array" por dentro, assim, ela é muito boa para
     * realizarmos buscas em um elemento específico, porém, ela é muito demorada para adicionarmos ou removermos um elemento
     * no início dessa lista, pois, se ela tem 10 elementos e adicionarmos um elemento na posição
     * "0", ela moverá o elemento que está na posição "0" para a "1", o que está na posição "1" para a
     * "2" e assim por diante.
     *
     * A LinkedList facilita muito a inserção ou a remoção de elementos no começo da lista, mas ela é muito
     * lenta para obter elementos em um determinado index, como na posição "1000", pois ela começará a buscar
     * pelo começo.
     */

    public Curso(String nome, String instrutor){

        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula){

        this.aulas.add(aula);
    }

    public String getNome() {
        return this.nome;
    }

    public String getInstrutor() {
        return this.instrutor;
    }

    public List<Aula> getAulas() {

        return Collections.unmodifiableList(this.aulas); //Estamos encapsulando o método "getAulas()" para que ele retorne uma lista que não pode ser modificada. Assim, a única forma de inserirmos uma nova aula é através do método "adiciona()".
    }

    public int getTempoTotal(){
        int tempoTotal = 0;

        for(Aula aula: aulas){
            tempoTotal += aula.getTempo();
        }

        return tempoTotal;
    }

    public void matricula(Aluno aluno) {

        this.alunos.add(aluno);
    }

    public boolean estaMatriculado(Aluno aluno1) {

        return this.alunos.contains(aluno1);
    }

    public void matricular(Aluno aluno){


    }
}
