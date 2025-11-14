
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name="grado")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Grado {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_grado;
    @NotBlank @Size(max=50) private String nombre;
}
