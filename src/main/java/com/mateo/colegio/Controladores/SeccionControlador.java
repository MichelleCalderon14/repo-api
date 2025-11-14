package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Seccion;
import com.mateo.colegio.Servcios.SeccionServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/secciones")
@RequiredArgsConstructor
public class SeccionControlador {
    private final SeccionServicio servicio;

    @GetMapping public List<Seccion> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Seccion> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Seccion> crear(@RequestBody Seccion e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Seccion> actualizar(@PathVariable Integer id, @RequestBody Seccion e){
        e.setId_seccion(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
