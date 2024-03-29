package POO4.Practica;

public class Paisaje {

    private final tipoPaisaje tipo;

    public enum tipoPaisaje {
        Montanya, MontanyaNevada, Rio, Pradera, Pueblo, Ciudad, Bosque, Pantano, Desierto, Glaciar, Acantilado, Savana, Jungla
    }

    public Paisaje(tipoPaisaje tipo) {
        this.tipo = tipo;
    }

    public tipoPaisaje getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Estas en " + getTipo();
    }
}
