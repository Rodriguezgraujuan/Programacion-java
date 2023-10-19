package Tema2;

import java.util.Scanner;

public class Ejercicio7 {
    public static int verificacion(int num){
        int condicion = 0;
        if (num > 0){
            condicion = 1;
        }
        return condicion;
    }

    public static void primonoprimo(int num){
        int bucle = 0;
        for (int i = 1; i<=num;i++){
            if (num%i==0){
                bucle++;
            }
        }
        if (bucle==2){
            System.out.println(num + " es primo");
        } else if (num == 1){
            System.out.println(num + " es primo");
        }else {
            System.out.println(num + " no es primo");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (verificacion(num)==1) {
            if (verificacion(num) == 1) {
                primonoprimo(num);
            }
            num = in.nextInt();
        }
    }
}
