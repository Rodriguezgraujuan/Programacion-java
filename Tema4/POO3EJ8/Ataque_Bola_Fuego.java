package POO3EJ8;

public class Ataque_Bola_Fuego implements IAtaqueAvanzado {
    public void lanzar() {
        System.out.println("¡Bola de fuego lanzada!");
    }

    @Override
    public int[] coste() {
        int costeMana = 20;
        int costeEsfuerzoFisico = 5;
        int[] costeAtaque=new int[]{costeMana, costeEsfuerzoFisico};
        System.out.println("Coste del ataque Bola de Fuego: " + costeMana + " de maná y " + costeEsfuerzoFisico + " de esfuerzo físico");
        return costeAtaque;
    }

    @Override
    public int[] dmgInfligido() {
        int dmgMagico = 50;
        int dmgFisico = 10;
        int[] dmgAtaque=new int[]{dmgMagico, dmgFisico};
        System.out.println("Daño infligido por la Bola de Fuego: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
        return dmgAtaque;
    }
}
