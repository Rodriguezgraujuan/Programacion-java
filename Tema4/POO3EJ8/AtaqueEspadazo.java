package POO3EJ8;

public class AtaqueEspadazo implements IAtaqueAvanzado {
    @Override
    public void lanzar() {
        System.out.println("¡Espadazo lanzado!");
    }

    @Override
    public Coste coste() {
        int costeEsfuerzoFisico = 20;
        Coste costeEspadazo=new Coste(costeEsfuerzoFisico,0);
        System.out.println("Coste del ataque Espadazo: " + costeEsfuerzoFisico + " de esfuerzo físico");
        return costeEspadazo;
    }

    @Override
    public Dmg dmgInfligido() {
        int dmgFisico = 30;
        Dmg dmgEspadazo=new Dmg(dmgFisico,0);
        System.out.println("Daño infligido por el Espadazo: Daño físico: " + dmgFisico);
        return dmgEspadazo;
    }

}
