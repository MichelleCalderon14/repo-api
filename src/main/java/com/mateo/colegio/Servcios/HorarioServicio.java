package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.Horario;
import com.mateo.colegio.Repositorios.HorarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service @RequiredArgsConstructor @Transactional
public class HorarioServicio {
    private final HorarioRepositorio repo;
    public List<Horario> listar(){ return repo.findAll(); }
    public Optional<Horario> porId(Integer id){ return repo.findById(id); }
    public Horario guardar(Horario e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
