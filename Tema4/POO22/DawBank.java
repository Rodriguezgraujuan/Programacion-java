package POO22;

import java.util.Scanner;

public class DawBank {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String iban;
        String titular;
        
        boolean condition_dawbank=true;
        while (condition_dawbank){
            System.out.println("1. Crear cuenta \n"+
                                "2. Utilizar cuenta \n" +
                                "3. exit");
            int option1= in.nextInt();
            CuentaBancaria Cuenta = null;
            if (option1==1){
                boolean condition_crearCuenta=true;
                while (condition_crearCuenta) {
                    System.out.println("Introduce el iban:");
                    iban = in.nextLine();
                    System.out.println("Introduce el titular:");
                    titular = in.nextLine();
                    if (iban.length()==24) {
                        condition_crearCuenta = false;
                        Cuenta = new CuentaBancaria(iban, titular);
                    }
                }
            } else if (option1==2) {
                boolean condition_use=true;
                while (condition_use) {
                    int option_use = in.nextInt();
                    switch (option_use) {
                        case 1:
                            System.out.println(Cuenta);
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            condition_use = false;
                    }
                }
            } else {
                System.out.println("Gracias por usar DAWBANK");
                condition_dawbank=false;
            }
        }
    }
}
