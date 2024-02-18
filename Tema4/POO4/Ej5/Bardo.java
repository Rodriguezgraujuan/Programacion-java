package POO4.Ej5;

import java.util.Random;

public class Bardo implements Combatiente{

    private final int MaxHEALTH=50;
    private int health=MaxHEALTH;
    private static final Random random=new Random();

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public Ataque atacar() {
        Ataque ataque;
            int danyo = random.nextInt(10, 50);
            if (criticRate()) {
                danyo *= 2;
            }
            if (random.nextInt(1, 100) > 50) {
                ataque = new Ataque(Ataque.tipoAtaque.Cuerpo);
                ataque.setDanyoFisico(danyo);
            } else {
                ataque = new Ataque(Ataque.tipoAtaque.Distancia);
                ataque.setDanyoMagico(danyo);
            }
        return ataque;
    }

    @Override
    public void defender(Ataque ataque) {
        int danyo=(ataque.getDanyoFisico()+ ataque.getDanyoMagico())*2;
        setHealth(getHealth()-danyo);
    }

    @Override
    public boolean estaVivo() {
        return getHealth()>0;
    }

    private boolean criticRate(){
        return random.nextInt(0,100)<10;
    }

    @Override
    public String toString() {
        return "Bardo, fishum fishum";
    }
}
