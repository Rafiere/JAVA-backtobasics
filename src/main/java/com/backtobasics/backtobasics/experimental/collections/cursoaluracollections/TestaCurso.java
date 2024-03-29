package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));

        System.out.println(aulas);

        System.out.println(javaColecoes.getAulas());
    }
}
