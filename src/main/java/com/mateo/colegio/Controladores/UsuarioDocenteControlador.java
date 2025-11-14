package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.UsuarioDocente;
import com.mateo.colegio.Servcios.UsuarioDocenteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/usuarios-docentes")
@RequiredArgsConstructor
public class UsuarioDocenteControlador {
    private final UsuarioDocenteServicio servicio;

    @GetMapping
    public List<UsuarioDocente> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDocente> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<UsuarioDocente> crear(@RequestBody UsuarioDocente e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuarioDocente> actualizar(@PathVariable Integer id, @RequestBody UsuarioDocente e){
        e.setId_usuario(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
