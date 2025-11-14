package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Representante;
import com.mateo.colegio.Repositorios.RepresentanteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class RepresentanteServicio {
    private final RepresentanteRepositorio repo;
    public List<Representante> listar(){ return repo.findAll(); }
    public Optional<Representante> porId(Integer id){ return repo.findById(id); }
    public Representante guardar(Representante e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}