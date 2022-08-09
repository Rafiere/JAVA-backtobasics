package com.backtobasics.backtobasics.experimental.orientacaoaobjetos.cursoaluraorientacaoaobjetos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Conta { //Uma "class" define um "tipo" para o Java. É um "molde" para que os objetos sejam criados.

    private BigDecimal saldo;
    private Integer agencia;
    private Integer numero;
    private String titular;

    public void deposita(BigDecimal valor){

        /**
         * O "this" refere-se ao objeto que está invocando o método
         * "deposita()".
         */
        this.saldo = this.saldo.add(valor);
    }
}
