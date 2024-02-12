package POO3EJ8;

public class Ataque_Bola_Fuego implements IAtaqueAvanzado {
    public void lanzar() {
        System.out.println("¡Bola de fuego lanzada!");
    }

    @Override
    public void coste() {
        int costeMana = 20;
        int costeEsfuerzoFisico = 5;
        System.out.println("Coste del ataque Bola de Fuego: " + costeMana + " de maná y " + costeEsfuerzoFisico + " de esfuerzo físico");
    }

    @Override
    public void dmgInfligido() {
        int dmgMagico = 50;
        int dmgFisico = 10;
        System.out.println("Daño infligido por la Bola de Fuego: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
    }
}
