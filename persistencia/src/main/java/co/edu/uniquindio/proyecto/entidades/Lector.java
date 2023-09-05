package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@ToString(callSuper = true, onlyExplicitlyIncluded = true)
public class Lector extends Usuario implements Serializable{

    public Lector(String nombre, String email, String password, Estado estado) {
        super(nombre, email, password, estado);
    }

    public Lector() {
        super();
    }
}

