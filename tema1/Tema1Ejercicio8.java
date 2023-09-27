import java.util.Scanner;

public class Tema1Ejercicio8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce los euros que quieres convertir:");
        int mon= in.nextInt();
        double op = mon * 1.06;
        System.out.println(mon + "€ es igual a " + op + "$");
    }
}
