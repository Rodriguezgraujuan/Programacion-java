package Funkos1;

import java.rmi.server.UID;
import java.util.Date;

public class Funko {

    private String cod;
    private String nombre;
    private String modelo;
    private String precio;
    private String fecha;

    public Funko(String cod, String nombre, String modelo, String precio, String fecha){
        this.cod=cod;
        this.nombre=nombre;
        this.modelo=modelo;
        this.precio=precio;
        this.fecha=fecha;
    }

    public String getCod() {
        return cod;
    }

    public String getFecha() {
        return fecha;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }
}
