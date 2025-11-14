package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.*;

public interface AlumnoRepresentanteRepositorio extends JpaRepository<AlumnoRepresentante, AlumnoRepresentanteId> {
}
