package Funkos1;

import java.util.Date;

public class Funko {

    private String cod;
    private String nombre;
    private String modelo;
    private Double precio;
    private Date fecha;

    public Funko(String cod, String nombre, String modelo, Double precio, Date fecha){
        this.cod=cod;
        this.nombre=nombre;
        this.modelo=modelo;
        this.precio=precio;
        this.fecha=fecha;
    }

    public String getCod() {
        return cod;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                ", fecha='" + fecha + '\'';
    }
}
