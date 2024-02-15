package POO4.EJ2;

import POO3.Vehiculo;

public class Avion extends Vehiculo {

    private String pistaAterrizaje;
    public Avion(int hora, String matricula, String pistaAterrizaje) {
        super(hora, matricula);
        this.pistaAterrizaje=pistaAterrizaje;
    }

    @Override
    public String toString() {
        return "Soy un Avion";
    }
}
