package POO3EJ7;

public class Ataque_Magico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("¡Ataque Físico lanzado!");
    }

    @Override
    public int[] coste() {
        System.out.println("Coste del Ataque Físico: " + 15 + " de esfuerzo físico");
        return 15;
    }

    @Override
    public int[] dmgInfligido() {
        System.out.println("Daño infligido por el Ataque Físico: " + 37);
        return 37;
    }
}
