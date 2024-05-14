package Funkos2;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class FunkosSerial implements Serializable {

    @Serial
    private static final long serialVersionUID=100L;
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private Date fecha;


    public FunkosSerial(String cod, String nombre, String modelo, double precio, Date fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Funkos{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }

    public double getPrecio() {
        return precio;
    }
}
