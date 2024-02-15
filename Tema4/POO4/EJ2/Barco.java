package POO4.EJ2;

import POO3.Vehiculo;

public class Barco extends Vehiculo {
    private String canal;
    public Barco(int hora, String matricula, String canal) {
        super(hora, matricula);
        this.canal=canal;
    }

    @Override
    public String toString() {
        return "Soy un Barco";
    }
}
