package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Embeddable
@Data @NoArgsConstructor @AllArgsConstructor
public class AlumnoRepresentanteId implements Serializable {
    private Integer idAlumno;
    private Integer idRepresentante;
}
