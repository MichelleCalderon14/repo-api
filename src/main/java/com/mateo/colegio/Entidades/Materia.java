
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name="materia")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Materia {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_materia;
    @NotBlank @Size(max=100) private String nombre;
}
