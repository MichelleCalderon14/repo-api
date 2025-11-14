package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Integer> {
}
