package com.mateo.colegio.docentes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ExperienciaProfesionalRepository extends JpaRepository<ExperienciaProfesional, Long> {
    List<ExperienciaProfesional> findByDocente_Id(Long docenteId);
}
