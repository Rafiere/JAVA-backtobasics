package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 18);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(a1);
        javaColecoes.adiciona(a2);
        javaColecoes.adiciona(a3);

        /**
         * O "Map" é uma interface que não é filha de "Collection", ou seja, ela é
         * uma interface avulsa.
         */


    }
}
