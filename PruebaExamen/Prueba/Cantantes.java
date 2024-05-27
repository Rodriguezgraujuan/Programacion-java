package Prueba;

import java.util.ArrayList;
import java.util.List;

public class Cantantes extends Artista{
    private String nombre;
    private int anyo;
    private String tipoMusica;
    private List<Disco> discosPublicados= new ArrayList<>();

    Cantantes(String nombre){
        this.nombre=nombre;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void anyadirDisco(Disco disco) {
        discosPublicados.add(disco);
    }

    @Override
    public String toString() {
        return "Cantantes{" +
                "nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", tipoMusica='" + tipoMusica + '\'' +
                ", discosPublicados=" + discosPublicados +
                '}';
    }
}
