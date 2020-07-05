package com.edvaldo.cursomc.domain;

import com.edvaldo.cursomc.domain.enums.EstadoPagamento;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

@EqualsAndHashCode
@Setter
@Getter
@Entity
public class PagamentoComCartao extends Pagamento implements Serializable {

    private static final long serialVersionUID = 3907913613096980040L;

    private Integer numeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }
}
