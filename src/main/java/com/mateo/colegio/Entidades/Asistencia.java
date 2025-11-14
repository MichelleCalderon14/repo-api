package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity @Table(name="asistencia",
       uniqueConstraints = @UniqueConstraint(columnNames = {"id_alumno","id_curso","fecha"}))
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Asistencia {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_asistencia;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_alumno", nullable=false)
    private Alumno alumno;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_curso", nullable=false)
    private Curso curso;

    @Column(nullable=false)
    private LocalDate fecha;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=15)
    private EstadoAsistencia estado;

    @Column(length=255)
    private String observacion;
}
