package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.Alumno;
import com.mateo.colegio.Servcios.AlumnoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@RequiredArgsConstructor
public class AlumnoControlador {

    private final AlumnoServicio servicio;

    @GetMapping public List<Alumno> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtener(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Alumno> crear(@RequestBody Alumno a){
        Alumno saved = servicio.guardar(a);
        return ResponseEntity.created(URI.create("/api/alumnos/" + saved.getId_alumno())).body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Alumno> actualizar(@PathVariable Integer id, @RequestBody Alumno a){
        return servicio.porId(id).map(ex -> {
            a.setId_alumno(id);
            return ResponseEntity.ok(servicio.guardar(a));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
