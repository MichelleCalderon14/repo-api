package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name="alumno_representante")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class AlumnoRepresentante {

    @EmbeddedId
    private AlumnoRepresentanteId id;

    @ManyToOne(fetch=FetchType.LAZY) @MapsId("idAlumno") @JoinColumn(name="id_alumno")
    private Alumno alumno;

    @ManyToOne(fetch=FetchType.LAZY) @MapsId("idRepresentante") @JoinColumn(name="id_representante")
    private Representante representante;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=12)
    private Parentesco parentesco = Parentesco.TUTOR;
}
