package Prueba;

import java.util.ArrayList;
import java.util.List;

public class Djs extends Artista{
    private String nombre;
    private int anyo;
    private String tipoMusica;
    private List<Disco> discosPublicados = new ArrayList<>();

    Djs(String nombre){
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
        return "Djs{" +
                "nombre='" + nombre + '\'' +
                ", anyo=" + anyo +
                ", tipoMusica='" + tipoMusica + '\'' +
                ", discosPublicados=" + discosPublicados +
                '}';
    }
}
