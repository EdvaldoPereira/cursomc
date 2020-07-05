package com.edvaldo.cursomc.domain.enums;

import static java.util.Objects.isNull;

public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Fisica"),
    PESSOAJURICA(2, "Pessoa Juridica");

    final private int cod;
    final private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod) {

        if (isNull(cod)) {
            return null;
        }

        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (cod.equals(tipoCliente.getCod())) {
                return tipoCliente;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
