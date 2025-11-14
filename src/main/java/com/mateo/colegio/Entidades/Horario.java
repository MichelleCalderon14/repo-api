package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalTime;

@Entity
@Table(name="horario",
       uniqueConstraints = @UniqueConstraint(columnNames = {"id_curso","dia_semana","hora_inicio","hora_fin"}))
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Horario {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_horario;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_curso", nullable=false)
    private Curso curso;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_aula", nullable=false)
    private Aula aula;

    @Enumerated(EnumType.STRING)
    @Column(name="dia_semana", nullable=false, length=3)
    private DiaSemana diaSemana;

    @Column(name="hora_inicio", nullable=false)
    private LocalTime horaInicio;

    @Column(name="hora_fin", nullable=false)
    private LocalTime horaFin;
}
