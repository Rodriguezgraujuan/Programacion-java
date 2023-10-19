package Tema2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void triangulo(int num_lineas, String caracter){
        int num_letras = 0;
        for (int i = 1; i<=num_lineas; ++i, num_letras=0){
            for (int espacio = 1; espacio<=num_lineas-i; ++espacio){
                System.out.print(" ");
            }
            while (num_letras != 2 * i -1){
                System.out.print(caracter);
                num_letras++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el caracter");
        String caracter= in.nextLine();
        System.out.println("Introduce el numero de lineas");
        int num_lineas= in.nextInt();
        triangulo(num_lineas, caracter);
    }
}
