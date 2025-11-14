package com.mateo.colegio.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.*;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
}
