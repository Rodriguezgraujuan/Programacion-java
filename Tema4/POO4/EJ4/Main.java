package POO4.EJ4;

import POO3Ej4.DvD;
import POO3Ej4.Ficha;
import POO3Ej4.Libros;
import POO3Ej4.Revistas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static         Scanner in = new Scanner(System.in);

    public static void menu(){
        System.out.println("""
                1. Añadir item\s
                2. Buscar item\s
                3. Eliminar item\s
                4. Listado de la biblioteca\s
                5. Salir
                """);
    }

    public static Ficha selectionItem(){
        System.out.println("Que item quiere añadir:" +
                "1. DVD" +
                "2. Revista" +
                "3. Libro");
        Ficha item = null;
        int option= in.nextInt();
        switch (option){
            case 1->item = new DvD(2,"","",5, DvD.tipo.ACCION);
            case 2->item = new Revistas(8,"",2,2);
            case 3->item = new Libros(8,"","","");
            default -> System.out.println("Numero incorrecto");
        }
        return item;
    }
    public static void main(String[] args) {
        boolean conditon = true;
        ArrayList<Ficha> biblioteca = new ArrayList<>();
        while (conditon){
            menu();
            int option= in.nextInt();
            switch (option){
                case 1:
                    biblioteca.add(selectionItem());
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    conditon=false;
                default:
            }
        }
    }
}
