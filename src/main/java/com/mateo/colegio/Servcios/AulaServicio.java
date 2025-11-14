package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Aula;
import com.mateo.colegio.Repositorios.AulaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service @RequiredArgsConstructor @Transactional
public class AulaServicio {
    private final AulaRepositorio repo;
    public List<Aula> listar(){ return repo.findAll(); }
    public Optional<Aula> porId(Integer id){ return repo.findById(id); }
    public Aula guardar(Aula e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
