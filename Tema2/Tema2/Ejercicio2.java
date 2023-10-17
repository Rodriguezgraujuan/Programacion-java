package Tema2;

import java.util.Scanner;

public class Ejercicio2 {
    public static boolean isAdult(int edad){
        boolean mayor = false;
        int condicion = Ejercicio1.numberSign(edad);
        if (condicion >=0){
            if (edad>=18){
                mayor = true;
            }
        }
        return mayor;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = in.nextInt();
        if (isAdult(edad)){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor");
        }
    }
}
