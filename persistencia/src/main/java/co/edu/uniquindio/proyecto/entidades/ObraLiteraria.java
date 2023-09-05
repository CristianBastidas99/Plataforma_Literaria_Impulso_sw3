package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ObraLiteraria implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @ManyToMany
    @JoinTable(
            name = "escritor_obraliteraria",
            joinColumns = @JoinColumn(name = "obraliteraria_id"),
            inverseJoinColumns = @JoinColumn(name = "escritor_id")
    )
    private List<Escritor> escritores = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "obraliteraria_genero",
            joinColumns = @JoinColumn(name = "obraliteraria_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id"))
    private List<Genero> generos = new java.util.ArrayList<>();



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Escritor> getEscritores() {
        return escritores;
    }

    public void setEscritores(List<Escritor> escritores) {
        this.escritores = escritores;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
