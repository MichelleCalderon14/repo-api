package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name="representante")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Representante {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_representante;

    @NotBlank @Size(max=15)
    @Column(unique = true, nullable = false)
    private String cedula;

    @NotBlank @Size(max=100)
    private String nombres;

    @NotBlank @Size(max=100)
    private String apellidos;

    @Email @Size(max=120)
    private String email;

    @Size(max=20)
    private String telefono;

    @Size(max=200)
    private String direccion;
}
