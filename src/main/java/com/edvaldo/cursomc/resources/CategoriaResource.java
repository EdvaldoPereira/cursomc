package com.edvaldo.cursomc.resources;

import com.edvaldo.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar() {

        Categoria cat1 = new Categoria(1, "Informatica");
        Categoria cat2 = new Categoria(2, "Escritorio");

        List<Categoria> categorias = new ArrayList<>();
        categorias.add(cat1);
        categorias.add(cat2);

        return categorias;
    }
}
