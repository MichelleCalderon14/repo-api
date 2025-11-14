package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.UsuarioRepresentante;
import com.mateo.colegio.Repositorios.UsuarioRepresentanteRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioRepresentanteServicio {
    private final UsuarioRepresentanteRepositorio repo;
    public List<UsuarioRepresentante> listar(){ return repo.findAll(); }
    public Optional<UsuarioRepresentante> porId(Integer id){ return repo.findById(id); }
    public UsuarioRepresentante guardar(UsuarioRepresentante e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}