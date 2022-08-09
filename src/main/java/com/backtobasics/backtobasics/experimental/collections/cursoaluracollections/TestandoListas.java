package com.backtobasics.backtobasics.experimental.collections.cursoaluracollections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args){

        String aula1 = "Conhecendo mais de listas!";
        String aula2 = "Modelando a classe \"Aula\"";
        String aula3 = "Trabalhando com cursos e sets!";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas); //O "toString" de cada um dos objetos dessa lista será lançado.

        aulas.remove(aula1); //Removendo o objeto "aula1".

        System.out.println(aulas);

        System.out.println("\n");
        //For each:
        for(String aula: aulas){

            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);

        System.out.println("A primeira aula é: " + primeiraAula);

        //"For" comum:

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }

        //Percorrendo com o "forEach()" do Java 8:

        System.out.println("\nTestando com 'forEach':");
        aulas.forEach(System.out::println); //Para cada aula, será exibido o "toString()" de cada aula.

        aulas.add("Aumentando nosso conhecimento!");

        Collections.sort(aulas); //Ordenando em ordem lexicográfica.

        System.out.println(aulas);


    }
}
