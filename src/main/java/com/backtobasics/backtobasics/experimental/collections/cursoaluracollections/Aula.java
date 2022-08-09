package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Aula implements Comparable<Aula> {

    private String titulo;
    private int tempo;

    @Override
    public String toString(){

        return "Aula: " + this.titulo + ", " + this.tempo + " minutos";
    }

    @Override
    public int compareTo(Aula outraAula) { //Esse método serve para dizermos como a ordenação dessa classe será feita.

        return this.titulo.compareTo(outraAula.getTitulo());
    }
}
