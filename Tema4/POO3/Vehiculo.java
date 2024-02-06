package POO3;

public class Vehiculo {
    private String motor;
    private String color;
    private String ruedas;

    public void setColor(String color) {
        this.color= color;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setRuedas(String ruedas) {
        this.ruedas = ruedas;
    }
    public String getMotor() {
        return motor;
    }
    public String getRuedas() {
        return ruedas;
    }

    public String getColor() {
        return color;
    }
}
