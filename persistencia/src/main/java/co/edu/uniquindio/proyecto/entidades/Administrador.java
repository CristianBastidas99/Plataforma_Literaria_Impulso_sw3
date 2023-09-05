package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Administrador extends Usuario implements Serializable {

    public Administrador(String nombre, String email, String password, Estado estado) {
        super(nombre, email, password, estado);
    }

    public Administrador() {
        super();
    }

}
