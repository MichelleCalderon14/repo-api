package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Nota;
import com.mateo.colegio.Servcios.NotaServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/notas")
@RequiredArgsConstructor
public class NotaControlador {
    private final NotaServicio servicio;

    @GetMapping
    public List<Nota> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Nota> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Nota> crear(@RequestBody Nota e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Nota> actualizar(@PathVariable Integer id, @RequestBody Nota e){
        e.setId_nota(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
