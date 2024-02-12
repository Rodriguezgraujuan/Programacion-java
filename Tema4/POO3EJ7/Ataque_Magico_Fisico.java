package POO3EJ7;

public class Ataque_Magico_Fisico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("¡Ataque Mágico y Físico lanzado!");
    }

    @Override
    public void coste() {
        int costoMana = 50;
        int costoEsfuerzoFisico = 25;
        System.out.println("Coste del Ataque Mágico y Físico: " + costoMana + " de maná y " + costoEsfuerzoFisico + " de esfuerzo físico");
    }

    @Override
    public void dmgInfligido() {
        int dmgMagico = 75;
        int dmgFisico = 34;
        System.out.println("Daño infligido por el Ataque Mágico y Físico: Daño mágico: " + dmgMagico + ", Daño físico: " + dmgFisico);
    }
}
