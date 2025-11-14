package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Seccion;
import com.mateo.colegio.Repositorios.SeccionRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service @RequiredArgsConstructor @Transactional
public class SeccionServicio {
    private final SeccionRepositorio repo;
    public List<Seccion> listar(){ return repo.findAll(); }
    public Optional<Seccion> porId(Integer id){ return repo.findById(id); }
    public Seccion guardar(Seccion e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
