
package com.mateo.colegio.docentes;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "docente_experiencia")
public class ExperienciaProfesional {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional=false) @JoinColumn(name="docente_perfil_id")
    private DocentePerfil docente;
    @Column(nullable=false, length=120)
    private String institucion;
    @Column(length=120)
    private String rol;
    private LocalDate desde;
    private LocalDate hasta;
    @Column(length=255)
    private String descripcion;
    public Long getId() { return id; }
    public DocentePerfil getDocente() { return docente; }
    public void setDocente(DocentePerfil docente) { this.docente = docente; }
    public String getInstitucion() { return institucion; }
    public void setInstitucion(String institucion) { this.institucion = institucion; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
    public LocalDate getDesde() { return desde; }
    public void setDesde(LocalDate desde) { this.desde = desde; }
    public LocalDate getHasta() { return hasta; }
    public void setHasta(LocalDate hasta) { this.hasta = hasta; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
