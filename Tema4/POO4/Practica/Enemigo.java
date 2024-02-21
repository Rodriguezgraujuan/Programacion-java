package POO4.Practica;

import POO4.Ej5.Ataque;

import java.util.Random;

public class Enemigo implements Personaje{

    private final int VIDA_DEFAULT=100;
    private int vida=VIDA_DEFAULT;

    @Override
    public Ataque atacarHeroe() {
        Random random=new Random();
        Ataque ataque = new Ataque(Ataque.tipoAtaque.Cuerpo);
        ataque.setDanyoFisico(random.nextInt(0,20));
        return ataque;
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
