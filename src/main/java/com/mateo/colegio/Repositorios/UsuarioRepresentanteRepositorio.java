package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.*;

public interface UsuarioRepresentanteRepositorio extends JpaRepository<UsuarioRepresentante, Integer> {
}
