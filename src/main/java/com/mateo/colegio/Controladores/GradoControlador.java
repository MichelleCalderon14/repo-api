package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Grado;
import com.mateo.colegio.Servcios.GradoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/grados")
@RequiredArgsConstructor
public class GradoControlador {
    private final GradoServicio servicio;

    @GetMapping public List<Grado> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Grado> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Grado> crear(@RequestBody Grado e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Grado> actualizar(@PathVariable Integer id, @RequestBody Grado e){
        e.setId_grado(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
