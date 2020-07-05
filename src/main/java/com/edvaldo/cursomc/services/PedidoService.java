package com.edvaldo.cursomc.services;

import com.edvaldo.cursomc.domain.Pedido;
import com.edvaldo.cursomc.exceptions.ObjectNotFoundException;
import com.edvaldo.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar(Integer id) {

        Optional<Pedido> pedido = pedidoRepository.findById(id);
        return pedido.orElseThrow(() -> new ObjectNotFoundException
                ("Objeto não encontrado Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
