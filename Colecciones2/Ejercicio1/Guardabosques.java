package Ejercicio1;

import POO3EJ2.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guardabosques {

    static Scanner in=new Scanner(System.in);


    public static int introducirHora(){
        int hora=-1;
        while (hora < 0 || hora > 24) {
            hora=in.nextInt();
            if (hora < 0 || hora > 24) {
                System.out.println("Hora incorrecta");
            }
        }
        return hora;
    }

    public static Avistamiento seleccionAnimalAvistado(){
        menuSeleccionAnimal();
        Avistamiento animal = null;
        int option= in.nextInt();
        in.nextLine();
        switch (option){
            case 1:
                System.out.println("Introduce  la especie,la hora, la longitud:");
                animal = new Serpientes(in.nextLine(), introducirHora(), in.nextInt());
                break;
            case 2:
                System.out.println("Introduce la especie, la hora, el peso:");
                animal = new Pajaros(in.nextLine(),introducirHora(), in.nextInt());
                break;
            case 3:
                System.out.println("Introduce la observacion, la hora, la cantidad:");
                animal = new Manada(in.nextLine(),introducirHora(), in.nextInt());
                break;
            default:
                System.out.println("Numero incorrecto");
        }
        return animal;
    }
    public static void anadirAvistamiento(List<Avistamiento> avistamientos){
        avistamientos.add(seleccionAnimalAvistado());
    }

    public static void menuSeleccionAnimal(){
        System.out.println("""
                1. Serpiente
                2. Pajaro
                3. Manada
                """);
    }

    public static void menu(){
        System.out.println("""
                1. Añadir Avistamiento
                2. Mostrar todos los avistamientos a partir de las 8
                3. Mostrar todos los avistamientos nocturnos
                4. Mostrar manadas
                5. Mostrar serpientes
                6. Mostrar pájaros
                7. Salir
                """);
    }

    public static void mostrarAvistamientosMayor8(List<Avistamiento> avistamientos){
        List<Avistamiento> avistamientosMostrar = avistamientos.stream().filter(Avistamiento -> Avistamiento.getHora()>8).toList();
        System.out.println(avistamientosMostrar);
    }

    public static void mostrarAvistamientosEntre20y8(List<Avistamiento> avistamientos){
        List<Avistamiento> avistamientosMostrar = avistamientos.stream().filter(Avistamiento -> Avistamiento.getHora()>=20 || Avistamiento.getHora()<8).toList();
        System.out.println(avistamientosMostrar);
    }

    public static void mostrarManadas(List<Avistamiento> avistamientos){
        List<Manada> manadas = null;
        for (Avistamiento avistamiento : avistamientos){
            if (avistamientos instanceof Manada){
                manadas.add((Manada) avistamiento);
            }
        }
    }

    public static void mostrarSerpiente(List<Avistamiento> avistamientos){

    }

    public static void mostrarPájaro(List<Avistamiento> avistamientos){

    }

    public static void main(String[] args) {
        List<Avistamiento> avistamientos = new ArrayList<>();

        boolean condition=true;
        while (condition){
            menu();
            int option= in.nextInt();
            switch (option){
                case 1:
                    anadirAvistamiento(avistamientos);
                    break;
                case 2:
                    mostrarAvistamientosMayor8(avistamientos);
                    break;
                case 3:
                    mostrarAvistamientosEntre20y8(avistamientos);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    condition=false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
