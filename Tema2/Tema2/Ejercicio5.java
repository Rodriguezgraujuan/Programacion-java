package Tema2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void ShowMultiplayTable(int num){
        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int num = in.nextInt();
        ShowMultiplayTable(num);
    }
}
