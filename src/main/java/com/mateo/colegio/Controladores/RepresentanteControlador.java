package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Representante;
import com.mateo.colegio.Servcios.RepresentanteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/representantes")
@RequiredArgsConstructor
public class RepresentanteControlador {
    private final RepresentanteServicio servicio;

    @GetMapping
    public List<Representante> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Representante> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Representante> crear(@RequestBody Representante e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Representante> actualizar(@PathVariable Integer id, @RequestBody Representante e){
        e.setId_representante(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
