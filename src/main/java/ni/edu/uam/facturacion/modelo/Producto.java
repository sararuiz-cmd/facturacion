package ni.edu.uam.facturacion.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class Producto {
    @Id
    @Column(length=9)
    int numero;

    @Column(length=50) @Required
    String descripcion;

    @Money // La propiedad precio se usa para almacenar dinero
    BigDecimal precio; // BigDecimal se suele usar para dinero

    @Files // Una galería de fotos completa está disponible
    @Column(length=32) // La cadena de 32 de longitud es para almacenar la clave de la galería
    String fotos;

    @TextArea // Esto es para un texto grande, se usará un área de texto o equivalente
    String observaciones;
    @ManyToOne(fetch= FetchType.LAZY)
    @DescriptionsList
    Autor autor;

}