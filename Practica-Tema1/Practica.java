import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int velocidad1;
        int ataque1;
        int defensa1;
        int vida1;

        int velocidad2;
        int ataque2;
        int defensa2;
        int vida2;

        int total1 = 501;
        int total2 = 501;

        while (total1 > 500) {
            System.out.println("Jugador 1, Introduce tus puntos de atributos. (No pases de 500)");
            System.out.println("Velocidad:");
            velocidad1 = in.nextInt();
            System.out.println("Ataque:");
            ataque1 = in.nextInt();
            System.out.println("Defensa:");
            defensa1 = in.nextInt();
            System.out.println("Vida:");
            vida1 = in.nextInt();
            total1 = velocidad1 + ataque1 + defensa1 + vida1;
            if (total1 > 500) {
                System.out.println("Atributos incorrectos. Deben ser 500 en total o menos");
            }
        }

        while (total2 > 500) {
            System.out.println("Jugador 2, Introduce tus puntos de atributos. (No pases de 500)");
            System.out.println("Velocidad:");
            velocidad2 = in.nextInt();
            System.out.println("Ataque:");
            ataque2 = in.nextInt();
            System.out.println("Defensa:");
            defensa2 = in.nextInt();
            System.out.println("Vida:");
            vida2 = in.nextInt();
            total2 = velocidad2 + ataque2 + defensa2 + vida2;

            if (total2 > 500) {
                System.out.println("Atributos incorrectos. Deben ser 500 en total o menos");
            }
        }
    }
}
