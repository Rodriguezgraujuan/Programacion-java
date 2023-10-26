package Tema2;

import java.util.Scanner;

public class MyMathMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige una opcion: ");
        System.out.println("""
                1- Perimetro y area del circulo, cuadrado y rectangulo.
                2- Para saber si un numero es primo.
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
                break;
            case 2:
                System.out.println("Introduce el numero primo: ");
                int numberprime = in.nextInt();
                boolean primenotprime = MyMath.isPrime(numberprime);
                if (primenotprime) {
                    System.out.println("Es primo.");
                } else {
                    System.out.println("No es primo");
                }
                break;
            case 3:
                System.out.println("Introduce el numero: ");
                int numberdigitcount = in.nextInt();
                int digitcount = MyMath.figureCount(numberdigitcount);
                System.out.println("Tiene " + digitcount + " digitos.");
                break;
            case 4:
                System.out.println("Introduce el numero: ");
                int evendigitcount = in.nextInt();
                int evencount = MyMath.evenFigureCount(evendigitcount);
                System.out.println("Tiene " + evencount + " digitos pares.");
                break;
            case 5:
                System.out.println("Introduce el numero: ");
                int odddigitcount = in.nextInt();
                int oddcount = MyMath.oddFigureCount(odddigitcount);
                System.out.println("Tiene " + oddcount + " digitos impares.");
                break;
            case 6:
                System.out.println("Introduce el numero del que quieres hacer el factorial.");
                int factorialnumber = in.nextInt();
                int factorial  = MyMath.factorial(factorialnumber);
                System.out.println(factorial);
                break;
            case 7:
                System.out.println("Introduce el numero del que quieres hacer el factorial en reversa.");
                int factorialRecursivenumber = in.nextInt();
                int factorialRecursive  = MyMath.factorialRecursive(factorialRecursivenumber);
                System.out.println(factorialRecursive);
                break;
            case 8:
                System.out.println("Introduce los digitos: A, B, C");
                int A = in.nextInt();
                int B = in.nextInt();
                int C = in.nextInt();
                int ecuation  = MyMath.quadraticEcuationSolutions(A, B, C);
                System.out.println("Tiene " + ecuation + " soluciones.");
                break;

            case 9:
                System.out.println("Introduce el numero del que quieres sumar sus digitos:");
                int digitsumatory = in.nextInt();
                int total  = MyMath.figuresSumatory(digitsumatory);
                System.out.println("El resultado es: " + total);
                break;
        }
    }
}
