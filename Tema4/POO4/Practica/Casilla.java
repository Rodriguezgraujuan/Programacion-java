package POO4.Practica;

import java.util.Random;

import static POO4.Practica.Paisaje.tipoPaisaje.*;

public class Casilla {

    private int posicion_x;
    private int posicion_y;
    private Paisaje paisaje;
    private Heroe heroe;
    private Personaje personaje;
    private Tesoro tesoro;

    public Casilla(Paisaje paisaje, int posicion_x, int posicion_y){
        this.paisaje=paisaje;
        this.posicion_x=posicion_x;
        this.posicion_y=posicion_y;
    }

    public void setTesoro(Tesoro tesoro) {
        this.tesoro = tesoro;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public int getPosicion_x() {
        return posicion_x;
    }
    public int getPosicion_y() {
        return posicion_y;
    }

    public Paisaje getPaisaje() {
        return paisaje;
    }

    public Tesoro getTesoro() {
        return tesoro;
    }

    private String getLetraPaisaje(){
        Paisaje.tipoPaisaje paisajeCuadricula= getPaisaje().getTipo();
            return switch (paisajeCuadricula) {
            case Acantilado -> "A";
            case Savana -> "S";
            case Jungla -> "J";
            case Glaciar -> "G";
            case Desierto -> "D";
            case Pantano -> "PA";
            case Bosque -> "B";
            case Ciudad -> "C";
            case Pueblo -> "PU";
            case Pradera -> "PR";
            case MontanyaNevada -> "MN";
            case Rio -> "R";
            default -> "M";
        };
    }
    @Override
    public String toString() {
        return getLetraPaisaje();
    }
}
