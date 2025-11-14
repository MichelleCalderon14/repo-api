
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity @Table(name="matricula")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Matricula {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_matricula;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_alumno")
    private Alumno alumno;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_curso")
    private Curso curso;

    private LocalDate fecha;
}
