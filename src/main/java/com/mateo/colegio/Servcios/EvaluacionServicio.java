package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Evaluacion;
import com.mateo.colegio.Repositorios.EvaluacionRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class EvaluacionServicio {
    private final EvaluacionRepositorio repo;
    public List<Evaluacion> listar(){ return repo.findAll(); }
    public Optional<Evaluacion> porId(Integer id){ return repo.findById(id); }
    public Evaluacion guardar(Evaluacion e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}