package com.edvaldo.cursomc.services;

import com.edvaldo.cursomc.domain.Cliente;
import com.edvaldo.cursomc.exceptions.ObjectNotFoundException;
import com.edvaldo.cursomc.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {

        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException
                ("Objeto não encontrado Id: " + id + Cliente.class.getName()));
    }
}
