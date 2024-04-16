package Ejercicio1;

public class Manada extends Avistamiento {
    private final int cantidadLobos;
    private final String observaciones;

    public Manada( String observaciones,int hora,int cantidadLobos) {
        super(hora);
        this.cantidadLobos = cantidadLobos;
        this.observaciones = observaciones;
    }

    public int getCantidadLobos() {
        return cantidadLobos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return "Manada{" +
                "cantidadLobos=" + cantidadLobos +
                ", observaciones='" + observaciones + '\'' +
                ",hora= "+getHora()+'\''+
                '}';
    }
}
