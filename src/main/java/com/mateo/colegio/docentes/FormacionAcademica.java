
package com.mateo.colegio.docentes;
import jakarta.persistence.*;
@Entity
@Table(name = "docente_formacion")
public class FormacionAcademica {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false) @JoinColumn(name="docente_perfil_id")
    private DocentePerfil docente;
    @Column(nullable=false, length=120)
    private String titulo;
    @Column(length=120)
    private String institucion;
    @Column(length=80)
    private String nivel;
    @Column(length=4)
    private String anio;
    public Long getId() { return id; }
    public DocentePerfil getDocente() { return docente; }
    public void setDocente(DocentePerfil docente) { this.docente = docente; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getInstitucion() { return institucion; }
    public void setInstitucion(String institucion) { this.institucion = institucion; }
    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public String getAnio() { return anio; }
    public void setAnio(String anio) { this.anio = anio; }
}
