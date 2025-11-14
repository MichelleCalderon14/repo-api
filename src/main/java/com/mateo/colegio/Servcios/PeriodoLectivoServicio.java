package com.mateo.colegio.Servcios;

import com.mateo.colegio.Entidades.PeriodoLectivo;
import com.mateo.colegio.Repositorios.PeriodoLectivoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

@Service @RequiredArgsConstructor @Transactional
public class PeriodoLectivoServicio {
    private final PeriodoLectivoRepositorio repo;
    public List<PeriodoLectivo> listar(){ return repo.findAll(); }
    public Optional<PeriodoLectivo> porId(Integer id){ return repo.findById(id); }
    public PeriodoLectivo guardar(PeriodoLectivo e){ return repo.save(e); }
    public void eliminar(Integer id){ repo.deleteById(id); }
}
