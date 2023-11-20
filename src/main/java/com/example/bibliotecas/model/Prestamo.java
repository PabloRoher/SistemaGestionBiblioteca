package com.example.bibliotecas.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "prestamos")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lector_id", nullable = false)
    private Lector lector;

    @ManyToOne
    @JoinColumn(name = "libro_id", nullable = false)
    private Libro libro;

    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo() {
    }

    public Prestamo(Lector lector, Libro libro, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.lector = lector;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }


}
