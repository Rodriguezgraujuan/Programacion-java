package POO4.Practica;

import POO4.Ej5.Ataque;

public interface Personaje {

    Ataque atacarHeroe();

    Recompensa darObjeto();

    void hablar();

    Heroe curar(Heroe heroe);
}
