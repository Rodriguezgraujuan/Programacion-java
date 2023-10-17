package Tema2;

import java.util.Scanner;

public class Ejercicio1_Tema2 {

    public static int numberSign(int num){
        int result = 0;
        if (num<0){
            result = -1;
        } else if (num>0){
            result = 1;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = in.nextInt();
        int resultado = numberSign(num);
        System.out.println(resultado);
    }
}
