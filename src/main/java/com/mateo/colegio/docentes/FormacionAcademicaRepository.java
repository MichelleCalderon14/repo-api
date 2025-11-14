package com.mateo.colegio.docentes;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FormacionAcademicaRepository extends JpaRepository<FormacionAcademica, Long> {
    List<FormacionAcademica> findByDocente_Id(Long docenteId);
}
