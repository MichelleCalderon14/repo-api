
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name="curso")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Curso {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_curso;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_materia")
    private Materia materia;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_docente")
    private Docente docente;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_grado")
    private Grado grado;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_seccion")
    private Seccion seccion;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_periodo")
    private PeriodoLectivo periodo;
}
