package ni.edu.uam.facturacion.modelo;

import javax.persistence.*;
import lombok.*;
import org.openxava.annotations.ListProperties;

import java.util.Collection;

@Embeddable @Getter @Setter
public class Detalle {

    int cantidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    Producto producto;
    @ElementCollection
    @ListProperties("producto.numero, producto.descripcion, cantidad")
    Collection<Detalle> detalles;


}