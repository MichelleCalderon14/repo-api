package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Materia;
import com.mateo.colegio.Repositorios.MateriaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service @RequiredArgsConstructor @Transactional
public class MateriaServicio {
    private final MateriaRepositorio repo;
    public List<Materia> listar(){ return repo.findAll(); }
    public Optional<Materia> porId(Integer id){ return repo.findById(id); }
    public Materia guardar(Materia e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
