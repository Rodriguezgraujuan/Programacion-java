package Funkos1;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FunkosRegistro {

    static Scanner in = new Scanner(System.in);

    public static void menu(){
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

    public static void crearFunko(TratamientoCSV csv1) throws ParseException {
        in.nextLine();
        System.out.println("Introduce la clave, nombre, modelo, precio y fecha de lanzamiento");
        String clave = in.nextLine();
        String nombre = in.nextLine();
        String modelo = in.nextLine();
        Double precio = in.nextDouble();
        in.nextLine();

        String fecha = in.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDate = null;
        fechaDate=sdf.parse(fecha);

        Funko funko = new Funko(clave,nombre,modelo,precio,fechaDate);
        csv1.setFunkos(funko);
    }

    public static void eliminarFunko(TratamientoCSV csv1){
        in.nextLine();
        System.out.println("Introduce la clave");
        String cod = in.nextLine();
        csv1.eliminarFunko(cod);
    }

    public static void main(String[] args) throws ParseException, IOException {
        TratamientoCSV csv1=new TratamientoCSV();

        boolean condition=true;
        while (condition){
            csv1.contenidoDelFichero();
            menu();
            int option = in.nextInt();
            switch (option){
                case 1:
                    crearFunko(csv1);
                    break;
                case 2:
                    eliminarFunko(csv1);
                    break;
                case 3:
                    csv1.mostrar();
                    break;
                case 4:
                    csv1.mostrarMasCaro();
                    break;
                case 5:
                    csv1.mostrarMedia();
                    break;
                case 6:
                    csv1.mostrarModelos();
                    break;
                case 7:
                    csv1.mostrar2023();
                    break;
                case 8:
                    condition=false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
            csv1.upload();
        }
    }
}
