package POO3;

public class Turismo extends Vehiculo{

    private int numPlaza;

    private tipoCoche tipo;

    public Turismo(String motor, String color, int ruedas, int numPlaza, tipoCoche tipo) {
        super(motor, color, ruedas);
        this.numPlaza=numPlaza;
        this.tipo=tipo;
    }

    public enum tipoCoche{
        PROFESIONAL, PARTICULAS;
    }

    public int getNumPlaza() {
        return numPlaza;
    }

    public tipoCoche getTipo() {
        return tipo;
    }

    public void setNumPlaza(int numPlaza) {
        this.numPlaza = numPlaza;
    }

    public void setTipo(tipoCoche tipo) {
        this.tipo=tipo;
    }
}
