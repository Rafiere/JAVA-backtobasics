package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        /**
         * A diferença de um "Set" para um "List" é que o "Set" não
         * guarda a ordem de inserção dos elementos, além disso, ele
         * não permite elementos repetidos.
         *
         * Os "Set" são melhores para utilizarmos os métodos "contains", pois ele utiliza uma tabela
         * de espalhamento internamente.
         */

        Set<String> alunos = new HashSet<>();
    }
}
