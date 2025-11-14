package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Alumno;

public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer> {
}
