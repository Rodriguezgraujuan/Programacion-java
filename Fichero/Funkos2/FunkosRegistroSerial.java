package Funkos2;

import javax.script.ScriptEngine;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FunkosRegistroSerial {

    static Scanner in = new Scanner(System.in);


    public static void menu() {
        System.out.println("""
                1. Añadir funko
                2. Borrar funko
                3. Mostrar todos los funkos
                4. Mostrar funko mas caro
                5. Mostrar la medio de precio de los funkos
                6. Funkos agrupados por modelos
                7. Mostrar funkos 2023
                8. Salir
                """);
    }

    public static void introducirDatosFunko(TratamientocsvSerial serial) throws ParseException {
        System.out.println("Introduce los datos del nuevo funko:" +
                "Cod, Nombre, Modelo, Precio, Fecha(yyyy-MM-dd)");
        in.nextLine();
        String cod=in.nextLine();
        String nombre=in.nextLine();;
        String modelo=in.nextLine();;
        double precio=in.nextDouble();
        in.nextLine();
        String fecha=in.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaFormato=formato.parse(fecha);
        FunkosSerial funko = new FunkosSerial(cod, nombre, modelo, precio, fechaFormato);

        serial.crearFunko(funko);
    }

    public static void main(String[] args) throws IOException, ParseException {

        TratamientocsvSerial serial = new TratamientocsvSerial();
        boolean condition = true;
        serial.crearFichero();
        while (condition) {
            menu();
            int option = in.nextInt();
            switch (option) {
                case 1:
                    introducirDatosFunko(serial);
                    break;
                case 2:
                    System.out.println("Introduce el codigo");
                    in.nextLine();
                    serial.borrarFunko(in.nextLine());
                    break;
                case 3:
                    serial.leerFunkos();
                    break;
                case 4:
                    serial.funkoCaro();
                    break;
                case 5:
                    serial.mediaFunko();
                    break;
                case 6:
                case 7:
                case 8:
                    condition = false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
