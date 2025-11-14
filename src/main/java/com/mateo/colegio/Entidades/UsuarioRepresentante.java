package com.mateo.colegio.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity @Table(name="usuario_representante")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class UsuarioRepresentante {
    @Id
    private Integer id_usuario;

    @OneToOne(fetch=FetchType.LAZY) @MapsId @JoinColumn(name="id_usuario")
    private Usuario usuario;

    @OneToOne(fetch=FetchType.LAZY) @JoinColumn(name="id_representante", unique=true, nullable=false)
    private Representante representante;
}
