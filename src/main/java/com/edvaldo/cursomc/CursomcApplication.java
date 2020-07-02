package com.edvaldo.cursomc;

import com.edvaldo.cursomc.domain.Categoria;
import com.edvaldo.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    @Autowired
    private CategoriaRepository categoriaRepository;


    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Categoria categoria = new Categoria(null, "Informatica");
        Categoria categoria1 = new Categoria(null, "Escritorio");

        categoriaRepository.saveAll(Arrays.asList(categoria, categoria1));


    }
}
