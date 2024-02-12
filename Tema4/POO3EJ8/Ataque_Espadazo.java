package POO3EJ8;

public class Ataque_Espadazo implements IAtaqueAvanzado {
    @Override
    public void lanzar() {
        System.out.println("¡Espadazo lanzado!");
    }

    @Override
    public void coste() {
        int costeEsfuerzoFisico = 20;
        System.out.println("Coste del ataque Espadazo: " + costeEsfuerzoFisico + " de esfuerzo físico");
    }

    @Override
    public void dmgInfligido() {
        int dañoFisico = 30;
        System.out.println("Daño infligido por el Espadazo: Daño físico: " + dañoFisico);
    }

}
