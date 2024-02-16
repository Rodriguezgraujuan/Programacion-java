package POO4.Ej5;

public class Ataque {
    private final int danyoDefault=0;
    private int danyoFisico=danyoDefault;
    private int danyoMagico=danyoDefault;
    private tipoAtaque tipo;

    public Ataque(tipoAtaque tipo){
        this.tipo=tipo;
    }

    public enum tipoAtaque{
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

    public tipoAtaque getTipo() {
        return tipo;
    }
}
