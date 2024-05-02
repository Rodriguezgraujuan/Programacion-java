package Funkos1;


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

    public static void crearFunko(TratamientoCSV csv1){
        in.nextLine();
        System.out.println("Introduce la clave, nombre, modelo, precio y fecha de lanzamiento");
        Funko funko = new Funko(in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine(),in.nextLine());
        csv1.anadirFunko(funko);
    }

    public static void main(String[] args) {
        TratamientoCSV csv1=new TratamientoCSV();
        csv1.contenidoDelFichero();

        boolean condition=true;
        while (condition){
            menu();
            int option = in.nextInt();
            switch (option){
                case 1:
                    crearFunko(csv1);
                    break;
                case 2:
                case 3:
                    csv1.mostrar();
                    break;
                case 4:
                case 5:
                case 6:
                case 7:

                case 8:
                    condition=false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
