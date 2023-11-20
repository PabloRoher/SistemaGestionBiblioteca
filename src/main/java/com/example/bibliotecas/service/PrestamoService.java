package com.example.bibliotecas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bibliotecas.model.Prestamo;
import com.example.bibliotecas.repository.PrestamoRepository;

import java.util.List;

@Service
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;

    @Autowired
    public PrestamoService(PrestamoRepository prestamoRepository) {
        this.prestamoRepository = prestamoRepository;
    }

    public Prestamo iniciarPrestamo(Prestamo prestamo) {
        // Lógica para iniciar un nuevo préstamo
        return prestamoRepository.save(prestamo);
    }

    public Prestamo devolverLibro(Long prestamoId) {
        // Lógica para manejar la devolución de un libro
        Prestamo prestamo = prestamoRepository.findById(prestamoId).orElseThrow(/* excepción */);
        // Actualizar el estado del préstamo...
        return prestamoRepository.save(prestamo);
    }

    public List<Prestamo> obtenerTodosLosPrestamos() {
        return prestamoRepository.findAll();
    }

    // Otros métodos
}
