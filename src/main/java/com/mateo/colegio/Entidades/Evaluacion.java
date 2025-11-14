package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity @Table(name="evaluacion",
        uniqueConstraints = @UniqueConstraint(columnNames = {"id_curso","nombre"}))
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Evaluacion {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_evaluacion;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_curso", nullable=false)
    private Curso curso;

    @Column(nullable=false, length=100)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=12)
    private TipoEvaluacion tipo;

    @Column(nullable=false)
    private LocalDate fecha;

    @Column(nullable=false, precision=5, scale=2)
    private BigDecimal porcentaje;
}
