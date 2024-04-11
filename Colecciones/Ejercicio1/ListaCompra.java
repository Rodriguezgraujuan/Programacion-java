package Ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {

    static Scanner in = new Scanner(System.in);
    public static String seleccionarObjeto(){
        return in.nextLine();
    }

    public static void menu(){
        System.out.println("""
                1. Añadir otra lista
                2. Mostrar productos existentes
                3. Productos que faltan añadir
                4. salir
                """);
    }

    public static void addProductosNuevoCarro(Set<String> listaCompra){
        System.out.println("Cuantos productos");
        int cantidad= in.nextInt();
        for (int i=0;i>cantidad;i++){
            listaCompra.add(in.nextLine());
        }
    }

    public static void main(String[] args) {
        Set<String> listaCompra= new HashSet<>();

        String producto= seleccionarObjeto();
        listaCompra.add(producto);
        for (int i=0;i<3;i++){
            producto= seleccionarObjeto();
            if (listaCompra.contains(producto)){
                System.out.println("Ya esta añadido");
            }else {
                listaCompra.add(producto);
            }
        }
        System.out.println(listaCompra);

        Set<String> carroCompra= new HashSet<>();
        Set<String> restantes=new HashSet<>();
        boolean condition = true;
        while (condition){
            menu();
            int option=in.nextInt();
            switch (option){
                case 1:
                    addProductosNuevoCarro(carroCompra);
                    break;
                case 2:
                    System.out.println(listaCompra);
                    break;
                case 3:

                    break;
                case 4:
                    condition=false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
