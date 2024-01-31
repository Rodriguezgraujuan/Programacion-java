package POO22;

public class CuentaBancaria {
    private String iban; //ES1234567891113151719122
    private String titular;
    private int saldo=0;
    private int[] historialMovimientos;
    private final int avisarHacienda=3000;
    private final int saldoNegativo=-50;

    public CuentaBancaria(String iban, String titular) {
        iban = iban.toUpperCase();
        if (iban.charAt(0) >= 65 && iban.charAt(0) <= 90) {
            if (iban.charAt(1) >= 65 && iban.charAt(1) <= 90) {
                this.iban = iban;
            } else {
                System.out.println("IBAN incorrectinto");
            }
        } else {
            System.out.println("IBAN incorrecto");
        }
        this.titular = titular;
    }

    public String getIban() {
        return iban;
    }

    public int getSaldo() {
        return saldo;
    }

    public int ingreso(int ingreso) {
        if (ingreso > 0) {
            saldo += ingreso;
            setHistorialMovimientos(ingreso);
        }
        return saldo;
    }

    public int retirada(int dineroRetirar) {
        if (dineroRetirar > 0) {
            saldo -= dineroRetirar;
            setHistorialMovimientos(-dineroRetirar);
        }
        return saldo;
    }

    private void setHistorialMovimientos(int operacion) {
        int posicion = historialMovimientos.length - 1;
        if (operacion>avisarHacienda){
            System.out.println("AVISO: Notificar a hacienda");
        } else if (operacion<saldoNegativo){
            System.out.println("AVISO: Saldo negativo");
        }
        historialMovimientos[posicion] = operacion;
    }

    @Override
    public String toString() {
        return getIban()+ getIban()+ getSaldo();
    }
}
