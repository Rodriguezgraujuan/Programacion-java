package Tema2;

import java.util.Scanner;

public class Ejercicio3 {
    public static boolean validRadius(int radius){
        return radius > 0;
    }

    public static double calculateCirclePerimeter(int radius){
        return 2 * (Math.PI) * radius;
    }

    public static double calculateCircleArea(int radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el radio del circulo: ");
        double Area;
        double Perimeter;
        int radius = in.nextInt();
        if (validRadius(radius)) {
            Area = calculateCircleArea(radius);
            System.out.println("El area es " + Area);
            Perimeter = calculateCirclePerimeter(radius);
            System.out.println("El primetro es " + Perimeter);
        } else {
            System.out.println("Radio incorrecto.");
        }
    }
}
