package POO21;

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

    public void addCuenta(Cuenta cuenta, int saldo){
        if (cuentasBancarias == null){
            cuentasBancarias=new Cuenta[1];
            cuentasBancarias[0]=cuenta;
        }else if (cuentasBancarias.length<maxCuentas){
            cuentasBancarias=new Cuenta[cuentasBancarias.length+1];
            int posicion=cuentasBancarias.length;
            cuentasBancarias[posicion-1]= cuenta;
        } else {
            System.out.println("Ya tienes 3 cuentas");
        }
        cuenta.setSaldoDipsAbono(saldo);
    }

    public void personasMorosa() {
        if (!(cuentasBancarias==null)) {
            for (int i = 0; i < cuentasBancarias.length; i++) {
                int numeroCuenta = cuentasBancarias[i].getSaldoDisp();
                if (cuentasBancarias[i].getSaldoDisp() < 0) {
                    System.out.println("Es moroso");
                    break;
                } else {
                    System.out.println("No es moroso");
                }
            }
        } else {
            System.out.println("No tienes cuentas");
        }
    }
    @Override
    public String toString() {
        System.out.println("Tus datos son: \n");
        for (int i =0;i<getCuentasBancarias().length;i++){
            System.out.println(getCuentasBancarias()[i].getNumeroCuenta());
            System.out.println(getCuentasBancarias()[i].getSaldoDisp());
        }
        return dni;
    }
}
