package POO3EJ7;

public class Ataque_Magico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("¡Ataque Físico lanzado!");
    }

    @Override
    public void coste() {
        int costoEsfuerzoFisico = 15;
        System.out.println("Coste del Ataque Físico: " + costoEsfuerzoFisico + " de esfuerzo físico");
    }

    @Override
    public void dmgInfligido() {
        int dmgFisico = 37;
        System.out.println("Daño infligido por el Ataque Físico: " + dmgFisico);
    }
}
