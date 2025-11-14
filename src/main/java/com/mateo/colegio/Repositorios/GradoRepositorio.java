package com.mateo.colegio.Repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Grado;
public interface GradoRepositorio extends JpaRepository<Grado, Integer> {}
