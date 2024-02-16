package POO4.Ej5;

public class Ataque {
    private int danyoFisico;
    private int danyoMagico;

    private enum tipoAtaque{
        Cuerpo, Distancia
    }

    public void setDanyoFisico(int danyoFisico) {
        this.danyoFisico = danyoFisico;
    }

    public void setDanyoMagico(int danyoMagico) {
        this.danyoMagico = danyoMagico;
    }

    public int getDanyoFisico() {
        return danyoFisico;
    }

    public int getDanyoMagico() {
        return danyoMagico;
    }
}
