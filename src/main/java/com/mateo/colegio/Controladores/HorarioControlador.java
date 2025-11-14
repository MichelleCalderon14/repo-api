package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Horario;
import com.mateo.colegio.Servcios.HorarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/horarios")
@RequiredArgsConstructor
public class HorarioControlador {
    private final HorarioServicio servicio;

    @GetMapping public List<Horario> listar(){ return servicio.listar(); }
    @GetMapping("/{id}") public ResponseEntity<Horario> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
    @PostMapping public ResponseEntity<Horario> crear(@RequestBody Horario e){ return ResponseEntity.ok(servicio.guardar(e)); }
    @PutMapping("/{id}") public ResponseEntity<Horario> actualizar(@PathVariable Integer id, @RequestBody Horario e){
        e.setId_horario(id); return ResponseEntity.ok(servicio.guardar(e));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id); return ResponseEntity.noContent().build();
    }
}
