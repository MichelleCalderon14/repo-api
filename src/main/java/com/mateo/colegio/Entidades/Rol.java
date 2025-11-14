package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name="rol")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Rol {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_rol;

    @Column(nullable=false, unique=true, length=30)
    private String nombre;
}
