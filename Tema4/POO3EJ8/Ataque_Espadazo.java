package POO3EJ8;

public class Ataque_Espadazo implements IAtaqueAvanzado {
    @Override
    public void lanzar() {
        System.out.println("¡Espadazo lanzado!");
    }

    @Override
    public int[] coste() {
        int[] costeEsfuerzoFisico = new int[]{20};
        System.out.println("Coste del ataque Espadazo: " + costeEsfuerzoFisico[0] + " de esfuerzo físico");
        return costeEsfuerzoFisico;
    }

    @Override
    public int[] dmgInfligido() {
        int[] dmgFisico = new int[]{30};
        System.out.println("Daño infligido por el Espadazo: Daño físico: " + dmgFisico[0]);
        return dmgFisico;
    }

}
