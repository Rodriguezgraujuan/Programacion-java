package Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Acortador {

    static Scanner in = new Scanner(System.in);

    public static void menu(){
        System.out.println("""
                1. Crear nuevo registro
                2. Resolver dirección
                3. Borrar registro
                4. Mostrar todos los registros
                5. Salir
                """);
    }

    public static void borrarRegistro(Map<String, String> diccionarioURL){
        in.nextLine();
        System.out.println("Introduce la clave: ");
        String clave= in.nextLine();
        if (diccionarioURL.containsKey(clave)) {
            diccionarioURL.remove(clave);
            System.out.println("Clave eliminada");
        }else {
            System.out.println("No existe esta clave");
        }
    }

    public static void crearRegistro(Map<String, String> diccionarioURL){
        in.nextLine();

        System.out.println("Introduce la URL: ");
        String URL=in.nextLine();
        String clave=claveAleatoria();

        diccionarioURL.put(clave,URL);

    }

    private static String claveAleatoria(){
        UUID clave = UUID.randomUUID();
        return clave.toString();
    }

    public static void resolverDireccion(Map<String, String> diccionarioURL){
        in.nextLine();
        System.out.println("Introduce la clave: ");
        String clave= in.nextLine();
        if (diccionarioURL.containsKey(clave)){
            System.out.print("La URL es: ");
            System.out.println(diccionarioURL.get(clave));
        }else {
            System.out.println("Clave no existe");
        }
    }

    public static void main(String[] args) {
        Map<String, String> diccionarioURL= new HashMap<>();

        diccionarioURL.put("FQp7Y", "https://es.wikipedia.org/wiki/Wikipedia");

        boolean condition=true;
        while (condition){
            menu();
            int option= in.nextInt();
            switch (option){
                case 1:
                    crearRegistro(diccionarioURL);
                    break;
                case 2:
                    resolverDireccion(diccionarioURL);
                    break;
                case 3:
                    borrarRegistro(diccionarioURL);
                    break;
                case 4:
                    System.out.println(diccionarioURL);
                    break;
                case 5:
                    condition=false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
