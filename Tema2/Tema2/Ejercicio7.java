package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static int Oknumber(int num){
        int condicion = 0;
        if (num > 0){
            condicion = 1;
        }
        return condicion;
    }

    public static void primonoprimo(int num){
        boolean divisores = false;

        for (int i = 2; i<num;i++){
            if (num % i == 0) {
                divisores = true;
                break;
            }
        }
        if (divisores){
            System.out.println("No es primo");
        } else {
            System.out.println("Es primo");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (Oknumber(num)==1) {
            if (Oknumber(num) == 1) {
                primonoprimo(num);
            }
            num = in.nextInt();
        }
    }
}
