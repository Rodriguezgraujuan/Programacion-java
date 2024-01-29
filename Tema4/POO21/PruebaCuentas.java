package POO21;

import java.util.Objects;
import java.util.Scanner;

public class PruebaCuentas {
    static Scanner in = new Scanner(System.in);

    public static String preguntarDni(){
        in.next();
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
        String dni;
        int numeroCuenta;
        Persona[] personas = new Persona[cantidadPersonas+1];
        while (!exit){
            System.out.println("Introduce un dato:" +
                    "1. Instanciar objetos de tipo Persona. \n" +
                    "2. Instanciar objetos de tipo Cuenta y asociarlo a una persona.\n" +
                    "3. Mostrar datos de una persona (por su dni).\n" +
                    "4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).\n" +
                    "5. Recibir un pago (por dni y núm de cuenta).\n" +
                    "6. Realizar transferencia entre cuentas.\n" +
                    "7. Imprimir las personas morosas \n"+
                    "8. Exit");
            int opcion = in.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce el dni");
                    dni= in.nextLine();
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
                    dni=preguntarDni();
                    System.out.println(buscarPersona(personas,dni));
                    break;
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
                    break;
                case 5:
                    dni=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta= in.nextInt();
                    for (int i=0;i<buscarPersona(personas,dni).getCuentasBancarias().length;i++){
                        if(buscarPersona(personas,dni).getCuentasBancariasNum(i).getNumeroCuenta()==numeroCuenta){
                            System.out.println("Introduce el pago");
                            int pago= in.nextInt();
                            buscarPersona(personas,dni).getCuentasBancariasNum(i).setSaldoDispRecibo(pago);
                        }
                    }
                    break;
                case 6:
                    boolean datosCorrectosoNo=false;
                    System.out.println("Persona 1");
                    dni=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta= in.nextInt();
                    System.out.println("Persona 2");
                    String dni2=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    int numeroCuenta2= in.nextInt();
                    for (int i=0;i<buscarPersona(personas,dni).getCuentasBancarias().length;i++) {
                        if (buscarPersona(personas, dni).getCuentasBancariasNum(i).getNumeroCuenta() == numeroCuenta) {
                            System.out.println("Ingrese el importe");
                            int importeTransferencia = in.nextInt();
                            for (int k = 0; i < buscarPersona(personas, dni).getCuentasBancarias().length; k++) {
                                if (buscarPersona(personas, dni2).getCuentasBancariasNum(k).getNumeroCuenta() == numeroCuenta2) {
                                    buscarPersona(personas, dni2).getCuentasBancariasNum(k).setSaldoDipsAbono(importeTransferencia);
                                    datosCorrectosoNo=true;
                                }else {
                                    System.out.println("Datos incorrectos");
                                }
                            }
                            if (datosCorrectosoNo) {
                                buscarPersona(personas, dni).getCuentasBancariasNum(i).setSaldoDispRecibo(importeTransferencia);
                            }
                        }
                    }
                    break;
                case 7:
                    for (int i=0;i<personas.length;i++) {
                        System.out.println(personas[i].getDni());
                        personas[i].personasMorosa();
                    }
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("No es una opcion");
            }
        }

    }
}
