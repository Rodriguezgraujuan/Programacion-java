package Ejercicio4;

public class Proceso {
    private String name;
    private double segundo;

    public Proceso(String name, double segundo) {
        this.name = name;
        this.segundo = segundo;
    }

    public double getSegundo() {
        return segundo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "name='" + name + '\'' +
                ", segundo=" + segundo +
                '}';
    }
}
