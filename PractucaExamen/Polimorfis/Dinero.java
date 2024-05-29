package Polimorfis;

public abstract class Dinero {

    private double valor;

    Dinero(Double valor){
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
