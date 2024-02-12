package POO3EJ8;

public class Ataque_Espadazo_Encantado implements IAtaqueAvanzado{
    @Override
    public void lanzar() {
        System.out.println("¡Espadazo encantado lanzado!");
    }

    @Override
    public void coste() {
        int costeMana = 30;
        int costeEsfuerzoFisico = 15;
        System.out.println("Coste del ataque Espadazo Encantado: " + costeMana + " de maná y " + costeEsfuerzoFisico + " de esfuerzo físico");
    }

    @Override
    public void dmgInfligido() {
        int dmgMagico = 40;
        int dmgFisico = 20;
        System.out.println("Daño infligido por el Espadazo Encantado: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
    }
}
