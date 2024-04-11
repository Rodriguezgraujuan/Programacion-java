package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {

    static Scanner in = new Scanner(System.in);

    public static void menu() {
        System.out.println("""
                1. Añadir Usuario
                2. Usuario atendido
                3. Eliminar usuario
                4. salir
                """);
    }

    public static Usuario anadirUsuario() {
        System.out.println("Introduce el dni, nombre, edad");
        String dni = in.nextLine();
        String nombre = in.nextLine();
        int edad = in.nextInt();
        return new Usuario(nombre, edad, dni);
    }

    public static void main(String[] args) {
        List<Usuario> banco = new ArrayList<>();

        boolean condition = true;
        while (condition) {
            int option = in.nextInt();

            switch (option) {
                case 1:
                    banco.add(anadirUsuario());
                    System.out.println("Usuario añadido a la cola");
                    break;
                case 2:
                    if (!banco.isEmpty()) {
                        System.out.println("Usuario eliminado");
                        banco.remove(0);
                    }
                    break;
                case 3:

                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
        }
    }

}
