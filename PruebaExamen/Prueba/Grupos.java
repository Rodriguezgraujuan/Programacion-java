package Prueba;

import java.util.ArrayList;
import java.util.List;

public class Grupos extends Artista{
    private String nombre;
    private int anyo;
    private String tipoMusica;
    private int componentes;
    private List<Disco> discosPublicados= new ArrayList<>();

    Grupos(String nombre){
        this.nombre=nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void anyadirDisco(Disco disco) {
        discosPublicados.add(disco);
    }

    @Override
    public String toString() {
        return "Grupos{" +
                "nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", tipoMusica='" + tipoMusica + '\'' +
                ", componentes=" + componentes +
                ", discosPublicados=" + discosPublicados +
                '}';
    }
}
