package POO4.Ej5;

import java.util.Random;

public class Druida implements Combatiente {
    private static final Random random = new Random();
    private final int MaxMANA = 100;
    private int mana = MaxMANA;

    public Druida() {
    }

    ;

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public Ataque atacar() {
        Ataque ataque = new Ataque(Ataque.tipoAtaque.Distancia);
        if (random.nextInt(0, 100) == 1) {
            ataque.setDanyoMagico(random.nextInt(5, 50));
        }
        return ataque;
    }

    @Override
    public void defender(Ataque ataque) {
        if (!escudo()) {
            int danyo = ataque.getDanyoFisico() + ataque.getDanyoMagico();
            setMana(getMana() - danyo);
        }
    }

    @Override
    public boolean estaVivo() {
        return getMana() > 0;
    }

    public boolean escudo(){
        int num= random.nextInt(1,10);
        boolean condition= num <= 1;
        return condition;
    }

    @Override
    public String toString() {
        return "Druida, wingardium leviosa";
    }
}
