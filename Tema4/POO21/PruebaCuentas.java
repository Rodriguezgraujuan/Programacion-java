package POO21;

import java.util.Objects;
import java.util.Scanner;

public class PruebaCuentas {
    static Scanner in = new Scanner(System.in);

    public static String preguntarDni(){
        System.out.println("Introduce tu dni");
        return in.nextLine();
    }

    public static Persona buscarPersona(Persona[] personas, String dniPersona){
        int posicion = 0;
        for (int i = 0;i<personas.length;i++) {
            if (Objects.equals(personas[i].getDni(), dniPersona)) {
                     posicion=i;
            }
        }
        return personas[posicion];
    }
    public static void main(String[] args) {
        boolean exit = false;
        int cantidadPersonas=0;
        String dni="";
        int numeroCuenta=0;
        Persona[] personas = new Persona[cantidadPersonas+1];
        while (!exit){
            int opcion = in.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce el dni");
                    dni= in.nextLine();
                    personas[cantidadPersonas]= new Persona(dni);
                    cantidadPersonas++;
                    break;
                case 2:
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta=in.nextInt();
                    System.out.println("Añade saldo o 0");
                    int saldo= in.nextInt();
                    Cuenta cuenta=new Cuenta(numeroCuenta);
                    dni= preguntarDni();
                    buscarPersona(personas, dni).addCuenta(cuenta);
                    break;
                case 3:
                    dni=preguntarDni();
                    System.out.println(buscarPersona(personas,dni));
                case 4:
                    dni=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta= in.nextInt();
                    for (int i=0;i<buscarPersona(personas,dni).getCuentasBancarias().length;i++){
                        if(buscarPersona(personas,dni).getCuentasBancariasNum(i).getNumeroCuenta()==numeroCuenta){
                            System.out.println("Introduce la nomina");
                            int nomina= in.nextInt();
                            buscarPersona(personas,dni).getCuentasBancariasNum(i).setSaldoDipsAbono(nomina);
                        }
                    }
                case 5:
                    dni=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta= in.nextInt();
                    for (int i=0;i<buscarPersona(personas,dni).getCuentasBancarias().length;i++){
                        if(buscarPersona(personas,dni).getCuentasBancariasNum(i).getNumeroCuenta()==numeroCuenta){
                            System.out.println("Introduce el pago");
                            int nomina= in.nextInt();
                            buscarPersona(personas,dni).getCuentasBancariasNum(i).setSaldoDipsAbono(nomina);
                        }
                    }
                case 6:
                case 7:

                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("No es una opcion");
            }
        }

    }
}
