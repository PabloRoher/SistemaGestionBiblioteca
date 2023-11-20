package com.example.bibliotecas.service;

import com.example.bibliotecas.model.Libro;
import org.springframework.stereotype.Service;

@Service
public class BibliotecarioService {

    private final LibroService libroService;
    private final PrestamoService prestamoService;

    public BibliotecarioService(LibroService libroService, PrestamoService prestamoService) {
        this.libroService = libroService;
        this.prestamoService = prestamoService;
    }

    public void agregarNuevoLibro(Libro libro) {
        libroService.guardarLibro(libro);
    }

    // Otros métodos relacionados con las operaciones de un bibliotecario...
}

