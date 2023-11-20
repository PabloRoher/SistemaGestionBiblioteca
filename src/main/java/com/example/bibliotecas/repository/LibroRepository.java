package com.example.bibliotecas.repository;

import com.example.bibliotecas.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
    // Métodos adicionales si son necesarios
}

