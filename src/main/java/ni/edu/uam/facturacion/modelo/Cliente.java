package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;
import org.openxava.annotations.View;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
@View(name="Simple", // Esta vista solo se usará cuando se especifique ?Simple?
        members="numero, nombre" // Muestra únicamente numero y nombre en la misma línea
)

@Entity @Getter
@Setter
public class Cliente {

    @Id
    @Column(length=6)
    int numero;
    @Column(length = 50)
    @Required
    String nombre;

    @Embedded // Así para referenciar a una clase incrustable
    Direccion direccion; // Una referencia Java convencional

}