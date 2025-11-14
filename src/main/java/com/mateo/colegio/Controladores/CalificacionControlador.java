package com.mateo.colegio.Controladores;

import com.mateo.colegio.Repositorios.CalificacionRepositorio;
import com.mateo.colegio.Entidades.Calificacion;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/calificaciones")
@RequiredArgsConstructor
public class CalificacionControlador {
    private final CalificacionRepositorio repo;
    @GetMapping public List<Calificacion> listar(){ return repo.findAll(); }
    @PostMapping public Calificacion crear(@RequestBody Calificacion c){ return repo.save(c); }
    @GetMapping("/{id}") public ResponseEntity<Calificacion> obtener(@PathVariable Integer id){
        return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
