package POO1;

import java.util.Scanner;

public class HordasVsHero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condition=true;
        String nombre="";
        int vida=0;
        int ataque=0;
        int defensa=0;
        while (condition) {
            System.out.println("Crea tu heroe: Tienes 200 puntos a repartir");
            System.out.println("Introduce tu nombre: ");
            nombre= in.nextLine();
            System.out.println("Vida: ");
            vida= in.nextInt();
            System.out.println("Ataque: ");
            ataque= in.nextInt();
            System.out.println("Defensa: ");
            defensa= in.nextInt();
            if (vida+ataque+defensa<=200){
                condition=false;
            }
        }

    }
}
