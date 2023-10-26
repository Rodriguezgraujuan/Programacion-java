package Tema2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige una opcion: ");
        System.out.println("""
                1- Muestra el signo de un número introducido por el usuario.
                2- Indica si el usuario es mayor de edad o no.
                3- Calcula el área y perímetro de un círculo.
                4- Conversor de euros a dólares y de dólares a euros.
                5- Mostrar tabla de multiplicar de un número.
                6- Mostrar tablas de multiplicar del 1 al 10.
                7- Comprobador de números primos.
                8- Comprobador de fechas.
                9- Dibujar triángulos""");
        int menu = in.nextInt();
        switch (menu){
            case 1:
                System.out.println("Introduce un numero");
                int num = in.nextInt();
                int result= Ejercicio1.numberSign(num);
                if (result==1){
                    System.out.println("El signo es: +");
                } else if (result==0){
                    System.out.println("El signo es: 0");
                } else {
                    System.out.println("El signo es: -");
                }
                break;
            case 2:
                System.out.println("Introduce la edad");
                int edad = in.nextInt();
                boolean mayor_edad= Ejercicio2.isAdult(edad);
                if (mayor_edad){
                    System.out.println("Eres mayor de edad");
                }else {
                    System.out.println("Eres menor");
                }
                break;
            case 3:
                int radius = in.nextInt();
                if (Ejercicio3.validRadius(radius)) {
                    int area = (int) Ejercicio3.calculateCircleArea(radius);
                    int perimetro = (int) Ejercicio3.calculateCirclePerimeter(radius);
                    System.out.println("El area es " + area);
                    System.out.println("El primetro es " + perimetro);
                } else {
                    System.out.println("Radio incorrecto");
                }
                break;
            case 4:
                System.out.println("Elije si quieres pasar de Euros a dolares (Eu2do) o Dolares a euros (Do2eu)");
                in.nextLine();
                String decision = in.nextLine();


                System.out.println("Introduce la cantidad de dinero: ");
                int dinero = in.nextInt();

                if (Ejercicio4.showMenu(decision).equals("Euros")){
                    double dolares = Ejercicio4.euro2dolar(dinero);
                    System.out.println(dinero + "€ son " + dolares + "$");
                } else {
                    double euros = Ejercicio4.dolar2euro(dinero);
                    System.out.println(dinero + "$ son " + euros + "€");
                }
                break;
            case 5:
                System.out.println("Introduce un numero:");
                int num_tabla = in.nextInt();
                Ejercicio5.tabla(num_tabla);
                break;
            case 6:
                for (int tablas10 =1;tablas10<=10;tablas10++) {
                    Ejercicio6.tabla(tablas10);
                }
                break;
            case 7:
                int number = in.nextInt();

                while (Ejercicio7.verificacion(number)==1) {
                    if (Ejercicio7.verificacion(number) == 1) {
                        Ejercicio7.primonoprimo(number);
                    }
                    number = in.nextInt();
                }
                break;
            case 8:
                System.out.println("Introduce dia, mes, año");
                int dia = in.nextInt();
                int mes = in.nextInt();
                int year = in.nextInt();

                if (Ejercicio8.verificacion_numeros(dia, mes) == 0) {
                    System.out.println("Fecha incorrecta");
                } else {
                    Ejercicio8.fecha(dia, mes, Ejercicio8.bisiesto(year));
                }
                break;
            case 9:
                System.out.println("Introduce el caracter");
                in.nextLine();
                String caracter= in.nextLine();
                System.out.println("Introduce el numero de lineas");
                int num_lineas= in.nextInt();
                Ejercicio9.triangulo(num_lineas, caracter);
                break;
        }
    }
}
