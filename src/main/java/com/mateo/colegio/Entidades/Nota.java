package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity @Table(name="nota",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_evaluacion","id_alumno"}))
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Nota {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_nota;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_evaluacion", nullable=false)
    private Evaluacion evaluacion;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_alumno", nullable=false)
    private Alumno alumno;

    @Column(nullable=false, precision=6, scale=2)
    private BigDecimal puntaje;
}
