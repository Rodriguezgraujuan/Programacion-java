package Funkos2;

import java.util.Date;

public class Funkos {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private Date fecha;


    public Funkos(String cod, String nombre, String modelo, double precio, Date fecha) {
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
}
