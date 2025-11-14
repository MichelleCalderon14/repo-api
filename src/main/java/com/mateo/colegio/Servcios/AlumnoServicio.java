package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Alumno;
import com.mateo.colegio.Repositorios.AlumnoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class AlumnoServicio {
    private final AlumnoRepositorio repo;
    public List<Alumno> listar(){ return repo.findAll(); }
    public Optional<Alumno> porId(Integer id){ return repo.findById(id); }
    public Alumno guardar(Alumno a){ return repo.save(a); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
