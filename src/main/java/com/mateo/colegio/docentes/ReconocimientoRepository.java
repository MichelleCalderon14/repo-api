package com.mateo.colegio.docentes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ReconocimientoRepository extends JpaRepository<Reconocimiento, Long> {
    List<Reconocimiento> findByDocente_Id(Long docenteId);
}
