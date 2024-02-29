package POO4.Practica;

import POO4.Ej5.Ataque;

public interface IPersonaje {
    int vida = 0;

    Recompensa darObjeto();

    void hablar();

    void hacerAlgoHeroe(Heroe heroe);

    public void recibirDanyo(Ataque ataque);
}
