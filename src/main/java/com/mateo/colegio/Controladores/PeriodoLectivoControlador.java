package com.mateo.colegio.Controladores;

import com.mateo.colegio.Entidades.PeriodoLectivo;
import com.mateo.colegio.Servcios.PeriodoLectivoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/periodos")
@RequiredArgsConstructor
public class PeriodoLectivoControlador {
    private final PeriodoLectivoServicio servicio;

    @GetMapping public List<PeriodoLectivo> listar(){ return servicio.listar(); }

    @GetMapping("/{id}")
    public ResponseEntity<PeriodoLectivo> porId(@PathVariable Integer id){
        return servicio.porId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PeriodoLectivo> crear(@RequestBody PeriodoLectivo e){
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PeriodoLectivo> actualizar(@PathVariable Integer id, @RequestBody PeriodoLectivo e){
        e.setId_periodo(id);
        return ResponseEntity.ok(servicio.guardar(e));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
