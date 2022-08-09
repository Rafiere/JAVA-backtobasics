package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 18);
        Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        Collections.sort(aulas); //Estamos ordenando pelo método "compareTo" dessa classe, que foi sobrescrito da interface "Comparable".

        System.out.println("\n" + aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); //Estamos criando mais uma forma de realizarmos a ordenação, ou seja, um "comparator" personalizado.

        System.out.println("\n" + aulas);
    }
}
