package POO21;

public class Cuenta {
    private int numeroCuenta;
    private int saldoDisp;

    public void setSaldoDips(int ganarPagar) {
        if (ganarPagar > 0) {
            this.saldoDisp += ganarPagar;
        } else {
            this.saldoDisp -= ganarPagar;
        }
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void getSaldoDisp() {
        System.out.println("El dinero de la cuenta es: " + saldoDisp);
    }

    public void  getNumeroCuenta(){
        System.out.println("El numero de cuenta es: " + numeroCuenta);
    }
}
