package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Grado;
import com.mateo.colegio.Repositorios.GradoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service @RequiredArgsConstructor @Transactional
public class GradoServicio {
    private final GradoRepositorio repo;
    public List<Grado> listar(){ return repo.findAll(); }
    public Optional<Grado> porId(Integer id){ return repo.findById(id); }
    public Grado guardar(Grado e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
