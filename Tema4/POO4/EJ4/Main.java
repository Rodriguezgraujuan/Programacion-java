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

    public static Ficha addItem(){
        System.out.println("""
                Que item quiere añadir:\s
                1. DVD\s
                2. Revista\s
                3. Libro\s
                """);
        Ficha item = null;
        int option= in.nextInt();
        System.out.println("Ingrese el titulo:");
        in.nextLine();
        String titulo = in.nextLine();
        switch (option){
            case 1->item = new DvD(2,titulo,"Pepe",5, DvD.tipo.ACCION);
            case 2->item = new Revistas(8,titulo,2,2);
            case 3->item = new Libros(8,titulo,"Pepe","Pepe");
            default -> System.out.println("Numero incorrecto");
        }
        return item;
    }

    public static void buscarItem(ArrayList<Ficha> biblioteca) {
        System.out.println("Introduce el titulo");
        in.nextLine();
        boolean condition = false;
        String titulo = in.nextLine();
        for (int i = 0; i < biblioteca.size(); i++) {
            if (biblioteca.get(i).getTitulo().equals(titulo)) {
                System.out.println(biblioteca.get(i));
                condition = true;
                i = biblioteca.size() + 1;
            }
        }
        if (!condition){
            System.out.println("No hay ninguna reviste, libro o DVD con ese titulo");
        }
    }

    public static ArrayList<Ficha> eliminarItem(ArrayList<Ficha> biblioteca){
        System.out.println("Introduce el titulo");
        in.nextLine();
        String titulo= in.nextLine();
        for (int i = 0; i<biblioteca.size();i++){
            if (biblioteca.get(i).getTitulo().equals(titulo)){
                biblioteca.remove(i);
            }else {
                System.out.println("No hay ninguna reviste, libro o DVD con ese titulo");
            }
        }
        return biblioteca;
    }

    public static void mostrarBiblioteca(ArrayList<Ficha> biblioteca){
        for (Ficha ficha : biblioteca) {
            System.out.println(ficha);
        }
    }
    public static void main(String[] args) {
        boolean conditon = true;
        ArrayList<Ficha> biblioteca = new ArrayList<>();
        while (conditon){
            menu();
            int option= in.nextInt();
            switch (option){
                case 1:
                    biblioteca.add(addItem());
                    break;
                case 2:
                    buscarItem(biblioteca);
                    break;
                case 3:
                    eliminarItem(biblioteca);
                    break;
                case 4:
                    mostrarBiblioteca(biblioteca);
                    break;
                case 5:
                    conditon=false;
                default:
            }
        }
    }
}
