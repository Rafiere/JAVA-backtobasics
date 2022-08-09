package com.backtobasics.backtobasics.experimental.orientacaoaobjetos.cursoaluraorientacaoaobjetos;

import java.math.BigDecimal;

public class CriaConta {

    public static void main(String[] args) {

        Conta conta1 = new Conta();

        conta1.setSaldo(BigDecimal.valueOf(10));

        /**
         * Estamos passando a referência do objeto "conta1" para o objeto
         * "conta2", assim, qualquer alteração no objeto "conta2" será
         * realizado no objeto "conta1" também, pois eles apontam para o
         * mesmo endereço de memória. Se criássemos o "conta2" através de um
         * "new", eles apontariam para objetos diferentes.
         */
        Conta conta2 = conta1;

        conta2.setSaldo(BigDecimal.valueOf(100));

        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());

        conta2.deposita(BigDecimal.TEN);
    }
}
