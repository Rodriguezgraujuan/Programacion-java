package POO3EJ7;

public class Ataque_Fisico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("¡Ataque Mágico lanzado!");
    }

    @Override
    public int coste() {
        System.out.println("Coste del Ataque Mágico: " + 40 + " de maná");
        return 40;
    }

    @Override
    public int dmgInfligido() {
        System.out.println("Daño infligido por el Ataque Mágico: " + 63);
        return 63;
    }
}
