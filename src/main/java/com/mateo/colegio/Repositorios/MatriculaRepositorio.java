package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Matricula;

public interface MatriculaRepositorio extends JpaRepository<Matricula, Integer> {
}
