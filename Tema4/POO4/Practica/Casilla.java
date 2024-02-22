package POO4.Practica;

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
}
