package POO3EJ8;

public class AtaqueBolaFuego implements IAtaqueAvanzado {
    public void lanzar() {
        System.out.println("¡Bola de fuego lanzada!");
    }

    @Override
    public Coste coste() {
        int costeMana = 20;
        int costeEsfuerzoFisico = 5;

        Coste costeBolaFuego=new Coste(costeEsfuerzoFisico,costeMana);
        System.out.println("Coste del ataque Bola de Fuego: " + costeMana + " de maná y " + costeEsfuerzoFisico + " de esfuerzo físico");
        return costeBolaFuego;
    }

    @Override
    public Dmg dmgInfligido() {
        int dmgMagico = 50;
        int dmgFisico = 10;
        Dmg dmgBolaFuego=new Dmg(dmgFisico,dmgMagico);

        System.out.println("Daño infligido por la Bola de Fuego: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
        return dmgBolaFuego;
    }
}
