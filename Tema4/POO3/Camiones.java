package POO3;

public class Camiones extends Vehiculo {

    private int MMA;
    private PeligrosoNo peligrosoNo;

    public enum PeligrosoNo{
        SI,NO;
    }

    private int hora;
    private String matricula;

    public Camiones(String motor, String color, int ruedas, int MMA, PeligrosoNo peligrosoNo) {
        super(motor, color, ruedas);
        this.MMA=MMA;
        this.peligrosoNo=peligrosoNo;
    }

    public int getMMA() {
        return MMA;
    }

    public PeligrosoNo getPeligrosoNo() {
        return peligrosoNo;
    }

    public void setMMA(int MMA) {
        this.MMA = MMA;
    }

    public void setPeligrosoNo(PeligrosoNo peligrosoNo) {
        this.peligrosoNo = peligrosoNo;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Soy un Camion";
    }
}
