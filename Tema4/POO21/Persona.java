package POO21;

import java.util.Arrays;

public class Persona {
    private String dni;
    private Cuenta[] cuentasBancarias;
    private final int maxCuentas = 3;

    public Persona(String dni){
        this.dni=dni;
    }

    public Cuenta[] getCuentasBancarias() {
        return cuentasBancarias;
    }
    public Cuenta getCuentasBancariasNum(int num){
        return cuentasBancarias[num];
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void addCuenta(Cuenta cuenta){
        if (cuentasBancarias == null){
            cuentasBancarias=new Cuenta[1];
            cuentasBancarias[0]=cuenta;
        }else if (cuentasBancarias.length<maxCuentas){
            cuentasBancarias=new Cuenta[cuentasBancarias.length+1];
            int posicion=cuentasBancarias.length;
            cuentasBancarias[posicion]= cuenta;
        } else {
            System.out.println("Ya tienes 3 cuentas");
        }
    }

    public void personasMorosa() {
        for (int i=0;i<cuentasBancarias.length;i++){
            int numeroCuenta= cuentasBancarias[i].getSaldoDisp();
            if (cuentasBancarias[i].getSaldoDisp()<0){
                System.out.println("Es moroso");
                break;
            } else {
                System.out.println("No es moroso");
            }
        }
    }
    @Override
    public String toString() {
        return dni + "\n"+ Arrays.toString(cuentasBancarias);
    }
}
