package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Asistencia;
import com.mateo.colegio.Servcios.AsistenciaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/asistencias")
@RequiredArgsConstructor
public class AsistenciaControlador {
    private final AsistenciaServicio servicio;

    @GetMapping
    public List<Asistencia> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Asistencia> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Asistencia> crear(@RequestBody Asistencia e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Asistencia> actualizar(@PathVariable Integer id, @RequestBody Asistencia e){
        e.setId_asistencia(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
