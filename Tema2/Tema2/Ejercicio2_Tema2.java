package Tema2;

import java.util.Scanner;

public class Ejercicio2_Tema2 {
    public static int isAdult(int edad){
        int mayor = 0;
        int condicion = Ejercicio1_Tema2.numberSign(edad);
        if (condicion >=0){
            if (edad>=18){
                mayor = 1;
            }
        } else {
            mayor = -1;
        }
        return mayor;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad = in.nextInt();
        if (isAdult(edad)==1){
            System.out.println("Eres mayor de edad");
        }else if (isAdult(edad)==0){
            System.out.println("Eres menor");
        } else {
            System.out.println("Edad incorrecta");
        }
    }
}
