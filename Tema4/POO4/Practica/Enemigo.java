package POO4.Practica;

public class Enemigo implements Personaje{

    private final int VIDA_DEFAULT=100;
    private int vida=VIDA_DEFAULT;

    @Override
    public Heroe atacarHeroe(Heroe heroe) {
        return heroe;
    }

    @Override
    public String darObjeto() {
        return null;
    }

    @Override
    public void hablar() {
        System.out.println("Voy a hacerme un trono con tus huesos");
    }

    @Override
    public Heroe curar(Heroe heroe) {
        return heroe;
    }
}
