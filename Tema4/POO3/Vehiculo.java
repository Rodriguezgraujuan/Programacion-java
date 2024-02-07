package POO3;

public class Vehiculo {
    private String motor;
    private String color;
    private int ruedas;

    public Vehiculo(String motor, String color, int ruedas){
        this.motor=motor;
        this.color=color;
        this.ruedas=ruedas;
    }

    public void setColor(String color) {
        this.color= color;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
    public String getMotor() {
        return motor;
    }
    public int getRuedas() {
        return ruedas;
    }

    public String getColor() {
        return color;
    }
}
