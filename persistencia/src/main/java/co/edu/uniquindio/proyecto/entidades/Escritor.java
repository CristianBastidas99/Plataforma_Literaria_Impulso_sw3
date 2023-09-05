package co.edu.uniquindio.proyecto.entidades;

import org.hibernate.Hibernate;
import javax.persistence.*;
import java.io.Serializable;
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

    public Escritor(String nombre, String email, String password, Estado estado, String biografia) {
        super(nombre, email, password, estado);
        this.biografia = biografia;
    }

    public Escritor() {
        super();
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }
}
