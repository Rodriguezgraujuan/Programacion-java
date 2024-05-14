package Funkos1;

import javax.swing.*;

public class Encabezado {
    private String cod;
    private String nombre;
    private String modelo;
    private String precio;
    private String fecha;

    public Encabezado(String cod, String nombre, String modelo,String precio,  String fecha) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return cod + "\n"+ nombre + "\n" + modelo + "\n" + precio +"\n"+fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCod() {
        return cod;
    }
}
