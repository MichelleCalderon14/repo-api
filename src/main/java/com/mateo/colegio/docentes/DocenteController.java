package com.mateo.colegio.docentes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/docentes")
public class DocenteController {

    private final DocentePerfilRepository docenteRepo;
    private final FormacionAcademicaRepository formacionRepo;
    private final ExperienciaProfesionalRepository experienciaRepo;
    private final ReconocimientoRepository reconocimientoRepo;

    public DocenteController(
            DocentePerfilRepository d,
            FormacionAcademicaRepository f,
            ExperienciaProfesionalRepository e,
            ReconocimientoRepository r
    ) {
        this.docenteRepo = d;
        this.formacionRepo = f;
        this.experienciaRepo = e;
        this.reconocimientoRepo = r;
    }

    // -------- CRUD DocentePerfil --------
    @GetMapping
    public List<DocentePerfil> listar() {
        return docenteRepo.findAll();
    }

    @PostMapping
    public ResponseEntity<DocentePerfil> crear(@RequestBody DocentePerfil body) {
        return ResponseEntity.ok(docenteRepo.save(body));
    }

    @GetMapping("/{id}")
    public DocentePerfil get(@PathVariable Long id) {
        return docenteRepo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public DocentePerfil update(@PathVariable Long id, @RequestBody DocentePerfil body) {
        DocentePerfil d = docenteRepo.findById(id).orElseThrow();
        d.setNombreCompleto(body.getNombreCompleto());
        d.setFotografiaUrl(body.getFotografiaUrl());
        d.setCargo(body.getCargo());
        d.setArea(body.getArea());
        d.setAniosExperiencia(body.getAniosExperiencia());
        return docenteRepo.save(d);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        docenteRepo.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    // -------- Subrecursos: Formaciones --------
    @GetMapping("/{id}/formaciones")
    public List<FormacionAcademica> listFormaciones(@PathVariable Long id) {
        return formacionRepo.findByDocente_Id(id);
    }

    @PostMapping("/{id}/formaciones")
    public ResponseEntity<FormacionAcademica> addFormacion(@PathVariable Long id, @RequestBody FormacionAcademica f) {
        DocentePerfil d = docenteRepo.findById(id).orElseThrow();
        f.setDocente(d);
        return ResponseEntity.ok(formacionRepo.save(f));
    }

    @DeleteMapping("/formaciones/{formacionId}")
    public ResponseEntity<Void> deleteFormacion(@PathVariable Long formacionId) {
        formacionRepo.deleteById(formacionId);
        return ResponseEntity.noContent().build();
    }

    // -------- Subrecursos: Experiencias --------
    @GetMapping("/{id}/experiencias")
    public List<ExperienciaProfesional> listExperiencias(@PathVariable Long id) {
        return experienciaRepo.findByDocente_Id(id);
    }

    @PostMapping("/{id}/experiencias")
    public ResponseEntity<ExperienciaProfesional> addExperiencia(@PathVariable Long id, @RequestBody ExperienciaProfesional x) {
        DocentePerfil d = docenteRepo.findById(id).orElseThrow();
        x.setDocente(d);
        return ResponseEntity.ok(experienciaRepo.save(x));
    }

    @DeleteMapping("/experiencias/{experienciaId}")
    public ResponseEntity<Void> deleteExperiencia(@PathVariable Long experienciaId) {
        experienciaRepo.deleteById(experienciaId);
        return ResponseEntity.noContent().build();
    }

    // -------- Subrecursos: Reconocimientos --------
    @GetMapping("/{id}/reconocimientos")
    public List<Reconocimiento> listReconocimientos(@PathVariable Long id) {
        return reconocimientoRepo.findByDocente_Id(id);
    }

    @PostMapping("/{id}/reconocimientos")
    public ResponseEntity<Reconocimiento> addReconocimiento(@PathVariable Long id, @RequestBody Reconocimiento r) {
        DocentePerfil d = docenteRepo.findById(id).orElseThrow();
        r.setDocente(d);
        return ResponseEntity.ok(reconocimientoRepo.save(r));
    }

    @DeleteMapping("/reconocimientos/{reconocimientoId}")
    public ResponseEntity<Void> deleteReconocimiento(@PathVariable Long reconocimientoId) {
        reconocimientoRepo.deleteById(reconocimientoId);
        return ResponseEntity.noContent().build();
    }
}
