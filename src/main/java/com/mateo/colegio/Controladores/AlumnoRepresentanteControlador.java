package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.AlumnoRepresentante;
import com.mateo.colegio.Entidades.AlumnoRepresentanteId;
import com.mateo.colegio.Servcios.AlumnoRepresentanteServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/alumno-representantes")
@RequiredArgsConstructor
public class AlumnoRepresentanteControlador {
    private final AlumnoRepresentanteServicio servicio;

    @GetMapping
    public List<AlumnoRepresentante> listar(){ return servicio.listar(); }

    @PostMapping
    public ResponseEntity<AlumnoRepresentante> crear(@RequestBody AlumnoRepresentante e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping
    public ResponseEntity<Void> eliminar(@RequestBody AlumnoRepresentanteId id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
