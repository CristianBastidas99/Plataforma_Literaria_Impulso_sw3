package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Genero implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToMany(mappedBy = "generos")
    private List<ObraLiteraria> obraLiterarias = new ArrayList<>();

    public Genero(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Genero() {
    }

    public List<ObraLiteraria> getObraLiterarias() {
        return obraLiterarias;
    }

    public void setObraLiterarias(List<ObraLiteraria> obraLiterarias) {
        this.obraLiterarias = obraLiterarias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}