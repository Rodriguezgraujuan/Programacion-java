package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static int verificacion(int num){
        int condicion_num=0;
        if (num<=10&&num>=1){
            condicion_num = 1;
        }
        return condicion_num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = in.nextInt();

        int condition_tabla = verificacion(num);
        if (condition_tabla == 1){
            for (int i = 1;i<10; i++){
                int resul = num * i;
                System.out.println(resul);
            }
        }
    }
}
