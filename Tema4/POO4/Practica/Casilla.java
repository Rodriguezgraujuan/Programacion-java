package POO4.Practica;

public class Casilla {

    private final int posicion_x;
    private final int posicion_y;
    private Paisaje paisaje;
    private Heroe heroe;
    private IPersonaje personaje;
    private Tesoro tesoro;

    private boolean usada = false;

    public Casilla(Paisaje paisaje, int posicion_x, int posicion_y) {
        this.paisaje = paisaje;
        this.posicion_x = posicion_x;
        this.posicion_y = posicion_y;
    }

    public void setTesoro(Tesoro tesoro) {
        this.tesoro = tesoro;
    }

    public void setUsada(boolean usada) {
        this.usada = usada;
    }

    public boolean getUsada() {
        return usada;
    }

    public void setPersonaje(IPersonaje personaje) {
        this.personaje = personaje;
    }

    public IPersonaje getPersonaje() {
        return personaje;
    }

    public Paisaje getPaisaje() {
        return paisaje;
    }

    public Tesoro getTesoro() {
        return tesoro;
    }

    private String getLetraPaisaje() {
        Paisaje.tipoPaisaje paisajeCuadricula = getPaisaje().getTipo();
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
