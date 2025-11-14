package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Rol;
import com.mateo.colegio.Repositorios.RolRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class RolServicio {
    private final RolRepositorio repo;
    public List<Rol> listar(){ return repo.findAll(); }
    public Optional<Rol> porId(Integer id){ return repo.findById(id); }
    public Rol guardar(Rol e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}