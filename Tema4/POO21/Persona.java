package POO21;

import java.util.Scanner;

public class Persona {
    public Scanner in = new Scanner(System.in);

    private String dni;
    private Cuenta[] cuentasBancarias;
    private final int maxCuentas = 3;

    public Cuenta[] getCuentasBancarias() {
        return cuentasBancarias;
    }

    public String getDni() {
        return dni;
    }

    private void setCuentasBancarias(Cuenta numeroCuenta, int posicion){
        this.cuentasBancarias[posicion]=numeroCuenta;
    }

    public void añadirCuentas() {

    }

}
