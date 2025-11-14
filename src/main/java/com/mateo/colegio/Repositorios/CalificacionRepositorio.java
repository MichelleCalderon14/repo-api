package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Calificacion;

public interface CalificacionRepositorio extends JpaRepository<Calificacion, Integer> {
}
