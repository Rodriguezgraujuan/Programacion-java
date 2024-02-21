package POO4.Practica;

import POO4.Ej5.Ataque;

public interface Personaje {

    Ataque atacarHeroe();

    String darObjeto();

    void hablar();

    Heroe curar(Heroe heroe);
}
