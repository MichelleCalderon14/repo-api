package com.mateo.colegio.noticias;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/noticias")
public class NoticiaController {
    private final NoticiaRepository repo;
    public NoticiaController(NoticiaRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Noticia> listar() {
        return repo.findAll();
    }

    @PostMapping
    public ResponseEntity<Noticia> crear(@RequestBody Noticia n) {
        return ResponseEntity.ok(repo.save(n));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
