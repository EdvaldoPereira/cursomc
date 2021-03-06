package com.edvaldo.cursomc.services;

import com.edvaldo.cursomc.domain.Categoria;
import com.edvaldo.cursomc.exceptions.ObjectNotFoundException;
import com.edvaldo.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id) {

        Optional<Categoria> categoria = categoriaRepository.findById(id);
        return categoria.orElseThrow(() -> new ObjectNotFoundException
                ("Objeto não encontrado Id: " + id + ", Tipo: " + Categoria.class.getName()));
    }
}
