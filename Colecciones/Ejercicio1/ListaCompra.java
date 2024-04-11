package Ejercicio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {

    static Scanner in = new Scanner(System.in);
    public static String seleccionarObjeto(){
        return in.nextLine();
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
    }
}
