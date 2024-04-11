package Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {

    static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("""
                1. Dar de Alta
                2. Dar de Baja
                3. Mostrar datos de Usuario
                4. Modificar Usuario
                5. Salir
                """);
    }

    public static Usuario crearUsuario(String nombre, int edad) {
        return new Usuario(nombre, edad);
    }

    public static void anadirUsuarioMapa(Map<String, Usuario> gimnasio, String dni, String nombre, int edad) {
        gimnasio.put(dni, crearUsuario(nombre, edad));
    }

    public static String preguntarDni(){
        System.out.println("Introduce el dni");
        return in.nextLine();
    }

    public static void main(String[] args) {
        Map<String, Usuario> gimnasio = new HashMap<>();
        boolean condition = true;
        String dni;
        while (condition) {
            menu();
            int option = in.nextInt();
            switch (option) {
                case 1:
                    in.nextLine();
                    dni = preguntarDni();
                    if (!gimnasio.containsKey(dni)) {
                        System.out.println("Introduce tu nombre");
                        String name = in.nextLine();
                        System.out.println("Introduce tu edad");
                        int edad = in.nextInt();
                        anadirUsuarioMapa(gimnasio, dni, name, edad);
                    }else {
                        System.out.println("Este usuario ya esta en la lista. DNI en uso");
                    }
                    break;
                case 2:
                    in.nextLine();
                    dni = preguntarDni();
                    if (gimnasio.containsKey(dni)){
                        gimnasio.remove(dni);
                        System.out.println("Usuario eliminado");
                    }else {
                        System.out.println("El dni no esta en uso");
                    }
                    break;
                case 3:
                    in.nextLine();
                    dni = preguntarDni();
                    if (gimnasio.containsKey(dni)) {
                        System.out.println(gimnasio.get(dni));
                    } else {
                        System.out.println("Clave incorrecta");
                    }
                    break;
                case 4:
                    in.nextLine();
                    dni=preguntarDni();
                    if (gimnasio.containsKey(dni)){
                        System.out.println("Introduce el nombre y la edad");
                        gimnasio.get(dni).setName(in.nextLine());
                        gimnasio.get(dni).setEdad(in.nextInt());
                    } else {
                        System.out.println("Usuario no existe");
                    }
                    break;
                case 5:
                    condition = false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }
}
