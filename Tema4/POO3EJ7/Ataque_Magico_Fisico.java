package POO3EJ7;

public class Ataque_Magico_Fisico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("¡Ataque Mágico y Físico lanzado!");
    }

    @Override
    public int[] coste() {
        int[] costeAtaque = new int [2];
        costeAtaque= new int[]{25, 50};
        System.out.println("Coste del Ataque Mágico y Físico: " + 25 + " de maná y " + 50 + " de esfuerzo físico");
        return costeAtaque;
    }

    @Override
    public int[] dmgInfligido() {
        int[] dmgAtaque = new int [2];
        dmgAtaque= new int[]{75, 150};
        System.out.println("Daño infligido por el Ataque Mágico y Físico: Daño mágico: " + 75 + ", Daño físico: " + 150);
        return dmgAtaque;
    }
}
