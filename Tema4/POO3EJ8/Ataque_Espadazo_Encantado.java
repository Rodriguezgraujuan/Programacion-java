package POO3EJ8;

public class Ataque_Espadazo_Encantado implements IAtaqueAvanzado{
    @Override
    public void lanzar() {
        System.out.println("¡Espadazo encantado lanzado!");
    }

    @Override
    public int[] coste() {
        int costeMana = 30;
        int costeEsfuerzoFisico = 15;
        int[] costeAtaque=new int[]{costeMana,costeEsfuerzoFisico};
        System.out.println("Coste del ataque Espadazo Encantado: " + costeMana + " de maná y " + costeEsfuerzoFisico + " de esfuerzo físico");
        return costeAtaque;
    }

    @Override
    public int[] dmgInfligido() {
        int dmgMagico = 40;
        int dmgFisico = 20;
        int[] dmgAtaque=new int[]{dmgMagico,dmgFisico};
        System.out.println("Daño infligido por el Espadazo Encantado: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
        return dmgAtaque;
    }
}
