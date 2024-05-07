package Funkos1;

import javax.swing.*;

public class Encabezado {
    private String cod;
    private String nombre;
    private String modelo;
    private String precio;
    private String fecha;

    public Encabezado(String cod, String nombre, String precio, String modelo, String fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.modelo = modelo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Encabezado{" +
                "cod='" + cod + '\'' +
                ", nombre='" + nombre + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
