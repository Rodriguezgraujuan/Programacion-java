package POO21;

public class Cuenta {
    private int numeroCuenta;
    private int saldoDisp;

    public Cuenta(int numeroCuenta){
        this.numeroCuenta=numeroCuenta;
    }

    public void setSaldoDipsAbono(int abono) {
        this.saldoDisp+= abono;
    }

    public void setSaldoDispRecibo(int recibo){
        this.saldoDisp-=recibo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoDisp() {
        return saldoDisp;
    }

    public int getNumeroCuenta(){
    return numeroCuenta;
    }
}
