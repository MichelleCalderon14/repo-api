package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Asistencia;
import com.mateo.colegio.Repositorios.AsistenciaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class AsistenciaServicio {
    private final AsistenciaRepositorio repo;
    public List<Asistencia> listar(){ return repo.findAll(); }
    public Optional<Asistencia> porId(Integer id){ return repo.findById(id); }
    public Asistencia guardar(Asistencia e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}