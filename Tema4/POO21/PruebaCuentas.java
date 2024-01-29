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
        for (int i = 0;i<personas.length-1;i++) {
            if (Objects.equals(personas[i].getDni(), dniPersona)) {
                     posicion=i;
            }
        }
        return personas[posicion];
    }

    public static Persona[] copiarArray(Persona[] personas, int cantidadPersonas){
        Persona[] copia = new Persona[personas.length];
        copia=personas.clone();
        personas = new Persona[cantidadPersonas];
        for (int i=0; i<copia.length;i++){
            personas[i]=copia[i];
        }
        return personas;
    }
    public static void main(String[] args) {
        boolean exit = false;
        int cantidadPersonas=1;
        String dni;
        int numeroCuenta;
        Persona[] personas = new Persona[cantidadPersonas];
        while (!exit){
            personas=copiarArray(personas,cantidadPersonas);
            System.out.println("Introduce un dato: \n" +
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
                    in.nextLine();
                    System.out.println("Introduce el dni");
                    dni= in.nextLine();
                    personas[cantidadPersonas-1]= new Persona(dni);
                    cantidadPersonas++;
                    break;
                case 2:
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta=in.nextInt();
                    System.out.println("Añade saldo o 0");
                    int saldo= in.nextInt();
                    Cuenta cuenta=new Cuenta(numeroCuenta);
                    in.nextLine();
                    dni= preguntarDni();
                    buscarPersona(personas, dni).addCuenta(cuenta,saldo);
                    break;
                case 3:
                    in.nextLine();
                    dni=preguntarDni();
                    System.out.println(buscarPersona(personas,dni));
                    break;
                case 4:
                    in.nextLine();
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
                    in.nextLine();
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
                    in.nextLine();
                    boolean datosCorrectosoNo=false;
                    System.out.println("Persona 1");
                    dni=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    numeroCuenta= in.nextInt();
                    System.out.println("Persona 2");
                    in.nextLine();
                    String dni2=preguntarDni();
                    System.out.println("Introduce el numero de cuenta");
                    int numeroCuenta2= in.nextInt();
                    for (int i=0;i<buscarPersona(personas,dni).getCuentasBancarias().length;i++) {
                        if (buscarPersona(personas, dni).getCuentasBancariasNum(i).getNumeroCuenta() == numeroCuenta) {
                            System.out.println("Ingrese el importe");
                            int importeTransferencia = in.nextInt();
                            for (int k = 0; k < buscarPersona(personas, dni).getCuentasBancarias().length; k++) {
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
                    for (int i=0;i<personas.length-1;i++) {
                        System.out.println(personas[i].getDni());
                        personas[i].personasMorosa();
                    }
                    break;
                case 8:
                    exit = true;
                    System.out.println("Adios, gracias pero no lo vuelvas a intentar, muchos errores y correciones, no puedo más :D");
                    break;
                default:
                    System.out.println("No es una opcion");
            }
        }

    }
}
