package POO22;

import java.util.Arrays;
import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String iban;
        String titular;
        
        boolean condition_dawbank=true;
        while (condition_dawbank){
            CuentaBancaria Cuenta = null;
                boolean condition_crearCuenta=true;
                while (condition_crearCuenta) {
                    System.out.println("Introduce el iban:");
                    iban = in.nextLine();
                    iban=iban.toUpperCase();
                    System.out.println("Introduce el titular:");
                    titular = in.nextLine();
                    if (iban.length()==24&&iban.charAt(0) >= 65 && iban.charAt(0) <= 90&&iban.charAt(1) >= 65 && iban.charAt(1) <= 90) {
                        condition_crearCuenta = false;
                        Cuenta = new CuentaBancaria(iban, titular);
                    }
                }
                boolean condition_use=true;
                while (condition_use) {
                    int option_use = in.nextInt();
                    switch (option_use) {
                        case 1:
                            System.out.println("Tus datos son:");
                            System.out.print(Cuenta);
                            break;
                        case 2:
                            System.out.println("El iban de la cuenta es:");
                            System.out.print(Cuenta.getIban());
                            break;
                        case 3:
                            System.out.println("El titular de la cuenta es:");
                            System.out.print(Cuenta.getTitular());
                            break;
                        case 4:
                            System.out.println("El saldo de la cuenta es:");
                            System.out.println(Cuenta.getSaldo());
                            break;
                        case 5:
                            System.out.println("Introduce la cantidad a ingresar: ");
                            int ingresar= in.nextInt();
                            Cuenta.ingreso(ingresar);
                            break;
                        case 6:
                            System.out.println("Introduce la cantidad a retirar: ");
                            int retirar=in.nextInt();
                            Cuenta.retirada(retirar);
                            break;
                        case 7:
                            System.out.println("Estos son todos los movivmientos de la cuenta");
                            System.out.println(Arrays.toString(Cuenta.getHistorialMovimientos()));
                            break;
                        case 8:
                            condition_use = false;
                    }
                }
                System.out.println("Gracias por usar DAWBANK");
                condition_dawbank=false;
        }
    }
}
