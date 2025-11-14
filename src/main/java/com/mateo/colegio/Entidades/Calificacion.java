
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity @Table(name="calificacion")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Calificacion {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_calificacion;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_alumno")
    private Alumno alumno;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_curso")
    private Curso curso;

    @Column(precision=5, scale=2)
    private BigDecimal nota_final;
}
