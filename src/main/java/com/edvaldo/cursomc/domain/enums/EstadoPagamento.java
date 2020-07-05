package com.edvaldo.cursomc.domain.enums;

import static java.util.Objects.isNull;

public enum EstadoPagamento {

    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    final private int cod;
    final private String descricao;

    EstadoPagamento(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EstadoPagamento toEnum(Integer cod) {

        if (isNull(cod)) {
            return null;
        }

        for (EstadoPagamento estadoPagamento : EstadoPagamento.values()) {
            if (cod.equals(estadoPagamento.getCod())) {
                return estadoPagamento;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
