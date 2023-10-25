package Tema2;

import java.util.Scanner;

public class MyMathMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige una opcion: ");
        System.out.println("""
                1- Perimetro y area del circulo, cuadrado y rectangulo.
                2- Para saver si un numero es primo.
                3- Cantidad de digitos que tiene un numero.
                4- Cantidad de digitos pares que tiene un numero.
                5- Cantidad de digitos impares que tiene un numero.
                6- Factorial de un numero.
                7- Factorial de un numero en reversa.
                8- Cuantas soluciones tiene una ecuacion de 2 grado.
                9- Suma los digitos de un numero entero""");
        int menu = in.nextInt();
        switch (menu){
            case 1:
                System.out.println("Introduce el radio del circulo");
                double radio = in.nextDouble();
                double circleArea = MyMath.circleArea(radio);
                double circlePerimeter = MyMath.circlePerimeter(radio);

                System.out.println("Introduce el lado del cuadrado: ");
                double lado = in.nextDouble();
                double squareArea = MyMath.squarePerimeter(lado);
                double squarePerimeter = MyMath.squarePerimeter(lado);

                System.out.println("Introduce la base y altura del rectangulo");
                double base = in.nextDouble();
                double altura = in.nextDouble();
                double rectanglePerimeter = MyMath.rectanglePerimeter(base, altura);
                double rectangleArea = MyMath.rectangleArea(base, altura);

                System.out.println("La area y perimetro del circulo es: " + circleArea + " y " + circlePerimeter);
                System.out.println("El area y perimetro del cuadrado es " + squareArea + " y "+ squarePerimeter);
                System.out.println("El area y perimetro del rectangulo es " + rectangleArea + " y "+ rectanglePerimeter);

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:

            case 7:

            case 8:

            case 9:

        }
    }
}
