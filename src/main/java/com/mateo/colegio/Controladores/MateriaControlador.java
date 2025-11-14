package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Materia;
import com.mateo.colegio.Servcios.MateriaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/materias")
@RequiredArgsConstructor
public class MateriaControlador {
    private final MateriaServicio servicio;

    @GetMapping public List<Materia> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Materia> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Materia> crear(@RequestBody Materia e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materia> actualizar(@PathVariable Integer id, @RequestBody Materia e){
        e.setId_materia(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
