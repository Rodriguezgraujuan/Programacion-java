package POO3;

public class Ciclomotores extends Vehiculo{

    private int cilindrada;
    private final int CILINDRADA_MAXIMA=125;

    public Ciclomotores(String motor, String color, int ruedas, int cilindrada) {
        super(motor, color, ruedas);
        this.cilindrada=cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet(){
        return cilindrada<=CILINDRADA_MAXIMA;
    }
}
