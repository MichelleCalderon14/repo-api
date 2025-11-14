package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.*;

public interface EvaluacionRepositorio extends JpaRepository<Evaluacion, Integer> {
}
