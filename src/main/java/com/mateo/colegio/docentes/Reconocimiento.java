
package com.mateo.colegio.docentes;
import jakarta.persistence.*;
@Entity
@Table(name = "docente_reconocimiento")
public class Reconocimiento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false) @JoinColumn(name="docente_perfil_id")
    private DocentePerfil docente;
    @Column(nullable=false, length=160)
    private String nombre;
    @Column(length=160)
    private String otorgante;
    @Column(length=4)
    private String anio;
    @Column(length=255)
    private String descripcion;
    public Long getId() { return id; }
    public DocentePerfil getDocente() { return docente; }
    public void setDocente(DocentePerfil docente) { this.docente = docente; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getOtorgante() { return otorgante; }
    public void setOtorgante(String otorgante) { this.otorgante = otorgante; }
    public String getAnio() { return anio; }
    public void setAnio(String anio) { this.anio = anio; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
