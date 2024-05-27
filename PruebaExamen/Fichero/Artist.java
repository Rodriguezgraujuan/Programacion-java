package Fichero;

public class Artist {

    private String nombre;
    private String tema;
    private String cantidadDisco;

    public Artist(String nombre, String tema, String cantidadDisco) {
        this.nombre = nombre;
        this.tema = tema;
        this.cantidadDisco = cantidadDisco;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCantidadDisco() {
        return cantidadDisco;
    }

    public String getTema() {
        return tema;
    }
}
