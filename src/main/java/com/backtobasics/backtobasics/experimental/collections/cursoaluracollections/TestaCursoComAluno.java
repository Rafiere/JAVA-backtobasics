package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import java.util.*;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 18);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(a1);
        javaColecoes.adiciona(a2);
        javaColecoes.adiciona(a3);

        Aluno aluno1 = new Aluno("Rodrigo Turini", 34672);
        Aluno aluno2 = new Aluno("Guilherme Silveira", 5617);
        Aluno aluno3 = new Aluno("Maurício Aniche", 17645);

        javaColecoes.matricula(aluno1);

        System.out.println("O aluno 1 está matriculado: " + javaColecoes.estaMatriculado(aluno1));

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        String nome = "Rodrigo Turini";

        /**
         * Se dois objetos são considerados iguais, eles precisam ter o
         * mesmo hashcode, ou seja, o mesmo código de espalhamento, assim, sempre
         * que reescrevermos o método "equals()", temos que reescrever o método "hashcode()".
         *
         * Se não reescrevermos o método "hashCode()" ao alterarmos o método "equals()", o nosso método
         * "equals()" pode continuar funcionando normalmente, até que dois objetos tiverem dentro de estruturas
         * de dados que utilizem hash's, como o "HashSet", assim, novamente, sempre que alterarmos o método "equals()", temos
         * que alterar o método "hashCode()".
         *
         * O "LinkedHashSet" é uma implementação do "HashSet" que guarda a ordem em que os
         * elementos foram inseridos, porém, ele não permite dois valores iguais dentro do mesmo Set.
         *
         * O "TreeSet" é uma estrutura que guarda tudo dentro de uma árvore rubro-negra, porém, o tipo do "TreeSet" deve implementar
         * a interface "Comparable" ou passar um "Comparator" para o método construtor.
         */

         /** O "Iterator" é um objeto que serve para iterar dentro de uma coleção. Ele é muito antigo e era utilizado antes
         * do Java 5, por exemplo:
         */

         Set<Aluno> alunos = javaColecoes.getAlunos();
         Iterator<Aluno> iterador = alunos.iterator();

         while(iterador.hasNext()){ //Enquanto temos um próximo objeto nessa coleção, esse laço "while" será executado.
             Aluno proximoAluno = iterador.next(); //Estamos obtendo o próximo objeto dessa coleção.
             System.out.println(proximoAluno);
         }

        /**
         * Collections muito velhas:
         */

        Vector<Aluno> vetor = new Vector<>(); //É muito semelhante a listas, porém, ela é thread-safe. Não é recomendado utilizarmos essa coleção.

        Map<Integer, String> matriculaENomeDeAluno = new Hashtable<>(); //É muito semelhante aos mapas, mas é thread-safe. Ela não é mais utilizada.

        /**
         * Qual collection utilizar:
         *
         * Uma collection é tudo que implementa a interface "collection". Tudo que for
         * filha ou implementar essa interface também é uma collection.
         */


    }
}
