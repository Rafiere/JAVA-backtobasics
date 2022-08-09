package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 18);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(a1);
        javaColecoes.adiciona(a2);
        javaColecoes.adiciona(a3);

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis); //Estamos passando uma lista imutável para o construtor e recebendo uma lista mutável, em que a ordenação poderá ser realizada.

        Collections.sort(aulasMutaveis);

        System.out.println(aulasMutaveis);

        Collections.reverse(aulasMutaveis); //Estamos invertendo a ordem dessa lista.
        System.out.println(aulasMutaveis);

        Collections.shuffle(aulasMutaveis); //Estamos embaralhando a ordem dos elementos dessa lista.
        System.out.println(aulasMutaveis);

        System.out.println("Total do tempo das aulas: " + javaColecoes.getTempoTotal());
    }
}
