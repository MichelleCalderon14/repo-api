package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Aula;
import com.mateo.colegio.Servcios.AulaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/aulas")
@RequiredArgsConstructor
public class AulaControlador {
    private final AulaServicio servicio;

    @GetMapping public List<Aula> listar(){ return servicio.listar(); }
    @GetMapping("/{id}") public ResponseEntity<Aula> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping public ResponseEntity<Aula> crear(@RequestBody Aula e){ return ResponseEntity.ok(servicio.guardar(e)); }
    @PutMapping("/{id}") public ResponseEntity<Aula> actualizar(@PathVariable Integer id, @RequestBody Aula e){
        e.setId_aula(id); return ResponseEntity.ok(servicio.guardar(e));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id); return ResponseEntity.noContent().build();
    }
}
