package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.*;

public interface AsistenciaRepositorio extends JpaRepository<Asistencia, Integer> {
}
