package POO4.Ej5;

import java.util.Random;

public class Berserker implements Combatiente {
    private final int MaxHEALTH = 150;
    private int health = MaxHEALTH;
    private static final Random random = new Random();

    public Berserker() {
    }

    public int getHealth() {
        return health;
    }

    @Override
    public Ataque atacar() {

        Ataque ataque = new Ataque(Ataque.tipoAtaque.Cuerpo);
        if (random.nextInt(0, 100) == 1) {
            ataque.setDanyoFisico(random.nextInt(10, 170 - getHealth()));
        }
        return ataque;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public void defender(Ataque ataque) {
        int danyo = ataque.getDanyoFisico() + ataque.getDanyoMagico();
        if (ataque.getTipo() == Ataque.tipoAtaque.valueOf("Distancia")) {
            danyo *= 2;
        }
        setHealth(getHealth() - danyo);
    }

    @Override
    public boolean estaVivo() {
        return getHealth() > 0;
    }


}
