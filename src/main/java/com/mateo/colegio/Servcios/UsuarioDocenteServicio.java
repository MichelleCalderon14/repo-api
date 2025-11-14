package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.UsuarioDocente;
import com.mateo.colegio.Repositorios.UsuarioDocenteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioDocenteServicio {
    private final UsuarioDocenteRepositorio repo;
    public List<UsuarioDocente> listar(){ return repo.findAll(); }
    public Optional<UsuarioDocente> porId(Integer id){ return repo.findById(id); }
    public UsuarioDocente guardar(UsuarioDocente e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}