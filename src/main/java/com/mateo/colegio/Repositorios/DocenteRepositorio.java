package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Docente;

public interface DocenteRepositorio extends JpaRepository<Docente, Integer> {
}
