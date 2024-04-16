package Ejercicio1;

public class Serpientes extends Avistamiento {
     private final int longitud;
     private final String especie;

    public Serpientes( String especie,int hora,int longitud) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Serpientes{" +
                "longitud=" + longitud +
                ",especie='" + especie + '\'' +
                ",hora= "+getHora()+'\''+
                '}';
    }
}
