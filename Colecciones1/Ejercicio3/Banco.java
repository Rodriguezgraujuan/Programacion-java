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

    public static boolean checkUsuarioExiste(List<Usuario> banco, String dni){
        boolean condition =false;
        for (int i=0;i<banco.size();i++){
            if (banco.get(i).getDni().equals(dni)){
                condition=true;
            }
        }
        return condition;
    }

    public static void anadirUsuario(List<Usuario> banco) {
        System.out.println("Introduce el dni, nombre, edad");
        in.nextLine();
        String dni = in.nextLine();
        if (!checkUsuarioExiste(banco, dni)) {
            String nombre = in.nextLine();
            int edad = in.nextInt();
            banco.add(new Usuario(nombre, edad, dni));
            System.out.println("Usuario añadido");
        }else {
            System.out.println("Usuario existente");
        }
    }

    public static void main(String[] args) {
        List<Usuario> banco = new ArrayList<>();

        boolean condition = true;
        while (condition) {
            menu();
            int option = in.nextInt();

            switch (option) {
                case 1:
                    anadirUsuario(banco);
                    break;
                case 2:
                    if (!banco.isEmpty()) {
                        System.out.println("Usuario eliminado");
                        banco.remove(0);
                    } else {
                        System.out.println("Cola vacia");
                    }
                    break;
                case 3:
                    if (!banco.isEmpty()){
                        System.out.println("Introduce la posición");
                        int position = in.nextInt();
                        banco.remove(position);
                    }else{
                        System.out.println("Cola vacia");
                    }
                    break;
                case 4:
                    condition = false;
                    break;
                default:
                    System.out.println("Valor incorrecto");
            }
            if (condition) {
                System.out.println(banco);
            }
        }
    }

}
