package POO4.Practica;

import POO4.Ej5.Ataque;

public interface IPersonaje {
    int vida = 0;

    int getVida();

    Recompensa darObjeto();

    void hablar();

    String hacerAlgoHeroe(Heroe heroe);

    public void recibirDanyo(Ataque ataque);
}
