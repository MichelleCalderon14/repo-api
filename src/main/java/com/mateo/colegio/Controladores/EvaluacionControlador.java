package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Evaluacion;
import com.mateo.colegio.Servcios.EvaluacionServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/evaluaciones")
@RequiredArgsConstructor
public class EvaluacionControlador {
    private final EvaluacionServicio servicio;

    @GetMapping
    public List<Evaluacion> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Evaluacion> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Evaluacion> crear(@RequestBody Evaluacion e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evaluacion> actualizar(@PathVariable Integer id, @RequestBody Evaluacion e){
        e.setId_evaluacion(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
