package Polimorfis;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void menu(){
        System.out.println("""
                1. Añadir monedas, billetes o Tarjetas
                2. Eliminar monedas, billetes o Tarjetas
                3. Mostrar cartera
                4. Pagos
                5. Salir
                """);
    }

    public static void main(String[] args) {
        Cartera cartera = new Cartera();

        boolean condition = true;
        while (condition) {
            menu();
            int option = in.nextInt();
            switch (option) {
                case 1:
                    cartera.agregarDinero();
                    break;
                case 2:
                    cartera.eliminarDinero();
                    break;
                case 3:
                    cartera.mostrarCartera();
                    break;
                case 4:
                    System.out.println("Introduce el dinero a pagar");
                    cartera.pago(in.nextDouble());
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
