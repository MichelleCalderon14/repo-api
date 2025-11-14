package com.mateo.colegio.Repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mateo.colegio.Entidades.Horario;
public interface HorarioRepositorio extends JpaRepository<Horario, Integer> {}
