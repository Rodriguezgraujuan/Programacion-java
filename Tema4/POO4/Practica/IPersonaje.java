package POO4.Practica;

import POO4.Ej5.Ataque;

public interface IPersonaje {

    int getVida();

    Recompensa darObjeto();

    void hablar();

    String hacerAlgoHeroe(Heroe heroe);

    void recibirDanyo(Ataque ataque);
}
