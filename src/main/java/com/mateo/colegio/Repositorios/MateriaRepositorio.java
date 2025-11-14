package com.mateo.colegio.Repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Materia;
public interface MateriaRepositorio extends JpaRepository<Materia, Integer> {}
