package POO22;

public class CuentaBancaria {
    private String iban; //ES1234567891113151719122
    private String titular;
    private int saldo=0;
    private int[] historialMovimientos=new int[]{};
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

    public String getTitular() {
        return titular;
    }

    public int[] getHistorialMovimientos() {
        return historialMovimientos;
    }

    public int ingreso(int ingreso) {
        if (ingreso > 0) {
            saldo += ingreso;
            setHistorialMovimientos(ingreso);
        }
        aviso(ingreso);
        return saldo;
    }

    public int retirada(int dineroRetirar) {
        if (dineroRetirar > 0 && (getSaldo()-dineroRetirar)>-50) {
            saldo = saldo-dineroRetirar;
            setHistorialMovimientos(-dineroRetirar);
        } else {
            System.out.println("No se puede realizar tu operación, el saldo seria menor de -50");
        }
        aviso(dineroRetirar);
        return saldo;
    }

    private void setHistorialMovimientos(int operacion) {
        if (getHistorialMovimientos().length<100) {
            int posicion = historialMovimientos.length;
            int[] historialMovimientosCopi = historialMovimientos.clone();
            historialMovimientos = new int[historialMovimientosCopi.length + 1];
            System.arraycopy(historialMovimientosCopi, 0, historialMovimientos, 0, historialMovimientosCopi.length);
            historialMovimientos[posicion] = operacion;
        } else {
            System.out.println("Historial lleno, no se pueden realizar mas operaciones");
        }
    }

    private void aviso(int operacion){
        if (operacion > avisarHacienda) {
            System.out.println("AVISO: Notificar a hacienda");
        } else if (getSaldo() < saldoNegativo) {
            System.out.println("AVISO: Saldo negativo");
        }
    }

    @Override
    public String toString() {
        return "El iban es: "+getIban()+ "\n El tituales es:"+ getTitular()+"\n El saldo es:"+ getSaldo();
    }
}
