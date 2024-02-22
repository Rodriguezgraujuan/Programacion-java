package POO4.Practica;

public class Paisaje {

    private tipoPaisaje tipo;

    public enum tipoPaisaje{
        Montanya, MontanyaNevada, Rio, Pradera, Pueblo, Ciudad, Bosque, Pantano, Desierto, Glaciar, Acantilado, Savana, Jungla
    }

    public Paisaje(tipoPaisaje tipo){
        this.tipo=tipo;
    }

    public tipoPaisaje getTipo() {
        return tipo;
    }
    public void setTipo(tipoPaisaje tipo){
        this.tipo=tipo;
    }

}
