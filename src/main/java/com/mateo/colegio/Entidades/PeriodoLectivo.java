
package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name="periodo_lectivo")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class PeriodoLectivo {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id_periodo;
    private Integer anio;
    private Boolean activo;
}
