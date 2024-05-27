package Prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void menu(){
        System.out.println("""
                1. Añadir artista
                2. Mostrar artista
                3. Borrar artista
                4. Añadir nuevo disco
                5. Mostrar listado
                6. Mostrar cantantes
                7. Salir
                """);
    }
    public static void mostrarPosiblesArtistas(){
        System.out.println("""
                1. Cantante
                2. Grupo
                3. DJs
                """);
    }

    public static String introducirNombre(){
        System.out.println("Introduce el nombre");
        return in.nextLine();
    }

    public static void anyadirArtista(List<Artista> listadoArtistas){
        mostrarPosiblesArtistas();
        int optionArtista = in.nextInt();
        in.nextLine();
        String nombre= introducirNombre();
        switch (optionArtista){
            case 1:
                listadoArtistas.add(new Cantantes(nombre));
                break;
            case 2:
                listadoArtistas.add(new Grupos(nombre));
                break;
            case 3:
                listadoArtistas.add(new Djs(nombre));
                break;
            default:
                System.out.println("Valor incorrecto");
        }

    }

    public static void mostrarArtista(List<Artista> listadoArtistas){
        in.nextLine();

        String nombre= introducirNombre();
        for (Artista artista : listadoArtistas){
            if (artista.getNombre().equals(nombre)){
                System.out.println(artista);
            }
        }
    }

    public static void borrarArtista(List<Artista> listadoArtistas){
        in.nextLine();

        String nombre= introducirNombre();
        listadoArtistas.removeIf(artista -> artista.getNombre().equals(nombre));
    }

    public static void anyadirNuevoDisco(List<Artista> listadoArtistas){
        in.nextLine();

        String nombre= introducirNombre();
        for (Artista artista : listadoArtistas){
            if (artista.getNombre().equals(nombre)){
                artista.anyadirDisco(crearDisco());
            }
        }
    }

    private static Disco crearDisco(){
        System.out.println("Introduce el nombre del disco");
        return new Disco(in.nextLine());
    }

    public static void mostrarListado(List<Artista> listadoArtistas){
        listadoArtistas.forEach(System.out::println);
    }

    public static void mostrarCantantes(List<Artista> listadoArtistas) {
        for (Artista artista: listadoArtistas){
            if (artista instanceof Cantantes){
                System.out.println(artista);
            }
        }
    }
        public static void main(String[] args) {
        List<Artista> listadoArtistas = new ArrayList<>();

        boolean condition = true;
        while (condition){
            menu();
            int option= in.nextInt();
            switch (option){
                case 1:
                    anyadirArtista(listadoArtistas);
                    break;
                case 2:
                    mostrarArtista(listadoArtistas);
                    break;
                case 3:
                    borrarArtista(listadoArtistas);
                    break;
                case 4:
                    anyadirNuevoDisco(listadoArtistas);
                    break;
                case 5:
                    mostrarListado(listadoArtistas);
                    break;
                case 6:
                    mostrarCantantes(listadoArtistas);
                    break;
                case 7:
                    condition= false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
