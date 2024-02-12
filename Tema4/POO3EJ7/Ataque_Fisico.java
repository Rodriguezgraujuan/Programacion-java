package POO3EJ7;

public class Ataque_Fisico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("¡Ataque Mágico lanzado!");
    }

    @Override
    public void coste() {
        int costoMana = 40;
        System.out.println("Coste del Ataque Mágico: " + costoMana + " de maná");
    }

    @Override
    public void dmgInfligido() {
        int dmgMagico = 63;
        System.out.println("Daño infligido por el Ataque Mágico: " + dmgMagico);
    }
}
