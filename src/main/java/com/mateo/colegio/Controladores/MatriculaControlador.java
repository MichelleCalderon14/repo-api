package com.mateo.colegio.Controladores;

import com.mateo.colegio.Repositorios.MatriculaRepositorio;
import com.mateo.colegio.Entidades.Matricula;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
@RequiredArgsConstructor
public class MatriculaControlador {
    private final MatriculaRepositorio repo;
    @GetMapping public List<Matricula> listar(){ return repo.findAll(); }
    @PostMapping public Matricula crear(@RequestBody Matricula m){ return repo.save(m); }
    @GetMapping("/{id}") public ResponseEntity<Matricula> obtener(@PathVariable Integer id){
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
