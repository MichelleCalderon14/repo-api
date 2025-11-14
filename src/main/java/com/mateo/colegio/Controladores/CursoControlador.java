package com.mateo.colegio.Controladores;

import com.mateo.colegio.Repositorios.CursoRepositorio;
import com.mateo.colegio.Entidades.Curso;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cursos")
@RequiredArgsConstructor
public class CursoControlador {
    private final CursoRepositorio repo;
    @GetMapping public List<Curso> listar(){ return repo.findAll(); }
    @GetMapping("/{id}") public Curso obtener(@PathVariable Integer id){ return repo.findById(id).orElseThrow(); }
    @PostMapping public Curso crear(@RequestBody Curso c){ return repo.save(c); }
}
