package POO3EJ8;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado{
    @Override
    public void lanzar() {
        System.out.println("¡Espadazo encantado lanzado!");
    }

    @Override
    public Coste coste() {
        int costeMana = 30;
        int costeEsfuerzoFisico = 15;

        Coste costeEspadazoEncantado=new Coste(costeEsfuerzoFisico, costeMana);

        System.out.println("Coste del ataque Espadazo Encantado: " + costeMana + " de maná y " + costeEsfuerzoFisico + " de esfuerzo físico");
        return costeEspadazoEncantado;
    }

    @Override
    public Dmg dmgInfligido() {
        int dmgMagico = 40;
        int dmgFisico = 20;

        Dmg dmgEspadazoEncantado=new Dmg(dmgFisico, dmgMagico);

        System.out.println("Daño infligido por el Espadazo Encantado: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
        return dmgEspadazoEncantado;
    }
}
