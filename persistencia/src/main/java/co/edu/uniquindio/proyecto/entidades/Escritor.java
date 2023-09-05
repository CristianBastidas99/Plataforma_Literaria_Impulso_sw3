package co.edu.uniquindio.proyecto.entidades;

import org.hibernate.Hibernate;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Escritor extends Usuario implements Serializable {

    @Column(name = "biografia", length = 250, nullable = false)
    private String biografia;

    @ManyToMany(mappedBy = "escritores")
    private List<ObraLiteraria> obrasLiterarias = new ArrayList<>();

    public Escritor(String nombre, String email, String password, Estado estado, String biografia) {
        super(nombre, email, password, estado);
        this.biografia = biografia;
    }

    public Escritor() {
        super();
    }

    public List<ObraLiteraria> getObrasLiterarias() {
        return obrasLiterarias;
    }

    public void setObrasLiterarias(List<ObraLiteraria> obrasLiterarias) {
        this.obrasLiterarias = obrasLiterarias;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
