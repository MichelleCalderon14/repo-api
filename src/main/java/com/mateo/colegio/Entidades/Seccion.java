
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity @Table(name="seccion")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Seccion {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_seccion;
    @NotBlank @Size(max=10) private String nombre;
}
