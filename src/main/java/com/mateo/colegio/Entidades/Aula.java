package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name="aula")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Aula {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_aula;

    @NotBlank @Size(max=20)
    @Column(nullable=false, unique=true)
    private String codigo;

    @Positive @Column(nullable=false)
    private Integer capacidad;
}
