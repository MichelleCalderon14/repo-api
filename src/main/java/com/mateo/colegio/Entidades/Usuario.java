package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name="usuario")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Usuario {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_usuario;

    @NotBlank @Size(max=50)
    @Column(nullable=false, unique=true)
    private String username;

    @NotBlank @Size(max=255)
    @Column(name="password_hash", nullable=false)
    private String passwordHash;

    @Email @Size(max=120)
    @Column(unique=true)
    private String email;

    @ManyToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_rol", nullable=false)
    private Rol rol;

    @Column(nullable=false)
    private Boolean activo = true;
}
