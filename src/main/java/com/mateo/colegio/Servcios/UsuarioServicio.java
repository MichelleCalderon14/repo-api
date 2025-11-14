package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Usuario;
import com.mateo.colegio.Repositorios.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class UsuarioServicio {
    private final UsuarioRepositorio repo;
    public List<Usuario> listar(){ return repo.findAll(); }
    public Optional<Usuario> porId(Integer id){ return repo.findById(id); }
    public Usuario guardar(Usuario e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}