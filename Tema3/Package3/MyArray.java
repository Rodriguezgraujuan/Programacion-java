package Package3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    static Scanner in = new Scanner(System.in);

    public static int datoslista(){
        System.out.println("Cuantos datos tendra la lista:");
        return in.nextInt();

    }

    public static int[] creararray() {
        int cantidadnum=datoslista();
        System.out.println("Introduce los numeros:");
        int[] array = new int[cantidadnum];
        for (int i = 0; i < cantidadnum; i++) {
            int num = in.nextInt();
            array[i] = num;
        }
        return array;
    }

    public static void printarray(int[] Marray) {
        for (int j : Marray) {
            System.out.println(j);
        }
    }

    public static int maxArray(int[] Marray) {
        int max = 0;
        for (int number : Marray) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static int minArray(int[] Marray) {
        int min = maxArray(Marray);
        for (int Number : Marray) {
            if (Number < min) {
                min = Number;
            }
        }
        return min;
    }

    public static int medarray(int[] Marray) {
        int media = 0;
        for (int Number = 0; Number < Marray.length; Number++) {
            media += Marray[Number];
        }
        media /= Marray.length;
        return media;
    }

    public static boolean existenumarray(int[] Marray, int numero) {
        boolean existe = false;
        for (int j = 0; j < Marray.length; j++) {
            if (numero == Marray[j]) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public static int[] sumvectores(int[] Marrayvect1, int[] Marrayvect2) {
        int cantidad = Marrayvect2.length;
        if (Marrayvect1.length > Marrayvect2.length) {
            cantidad = Marrayvect1.length;
        }
        int[] a = new int[cantidad];
        for (int j = 0; j < Marrayvect1.length || j < Marrayvect2.length; j++) {
            a[j] = Marrayvect1[j] + Marrayvect2[j];
        }
        return a;
    }

    public static int[] restvectores(int[] Marrayvect1, int[] Marrayvect2) {
        int cantidad = Marrayvect2.length;
        if (Marrayvect1.length > Marrayvect2.length) {
            cantidad = Marrayvect1.length;
        }
        int[] b = new int[cantidad];
        for (int j = 0; j < Marrayvect1.length || j < Marrayvect2.length; j++) {
            b[j] = Marrayvect1[j] - Marrayvect2[j];
        }
        return b;
    }

    public static int prodvectores(int[] Marrayvect1, int[] Marrayvect2) {
        int total = 1;
        int cantidad = Marrayvect2.length;
        if (Marrayvect1.length > Marrayvect2.length) {
            cantidad = Marrayvect1.length;
        }
        int[] c = new int[cantidad];
        for (int j = 0; j < Marrayvect1.length || j < Marrayvect2.length; j++) {
            c[j] = Marrayvect1[j] * Marrayvect2[j];
            total *= c[j];
        }
        return total;
    }

    public static int[] invertirarray(int[] Marray) {
        int contador = Marray.length - 1;
        for (int i = 0; i < Marray.length / 2; i++) {
            int num1 = Marray[i];
            int num2 = Marray[contador];
            Marray[i] = num2;
            Marray[contador] = num1;
            contador--;
        }
        return Marray;
    }

    public static void procedinvertarray(int[] Marray) {
        int contador = Marray.length - 1;
        for (int i = 0; i < Marray.length / 2; i++) {
            int num1 = Marray[i];
            int num2 = Marray[contador];
            Marray[i] = num2;
            Marray[contador] = num1;
            contador--;
        }
    }

    public static boolean capicua(int[]Marray) {
        boolean condition = true;
        int contador = Marray.length-1;
        for (int i = 0; i < Marray.length / 2; i++) {
            if (Marray[i]!=Marray[contador]){
                System.out.println(Marray[i]);
                System.out.println(Marray[contador]);
                condition=false;
            }
            contador--;
        }
        return condition;
    }
    public static void main(String[] args) {
        System.out.println("¿Que quieres hacer?");
        System.out.println("""
                a) Un procedimiento que imprima el array.
                b) Una función que devuelva el máximo del array.
                c) Una función que devuelva el mínimo del array.
                d) Una función que devuelva la media.
                e) Una función que te diga si un elemento existe en el array o no.
                f) Una función que haga la suma de dos vectores (arrays).
                g) Una función que haga la resta de dos vectores (arrays).
                h) Una función que haga el producto escalar de dos vectores
                (arrays).
                i) Haz una función que invierta el orden de un array.
                j) Haz un procedimiento que invierta el orden de un array.
                k) Haz una función que nos indique si un array es capicua o no""");
        char eleccion = in.next().charAt(0);
        int[] Marray;
        int[] Marrayvect1;
        int[] Marrayvect2;
        switch (eleccion){
            case 'a':
                Marray= creararray();
                printarray(Marray);
                break;
            case 'b':
                Marray= creararray();
                System.out.println(maxArray(Marray));
                break;
            case 'c':
                Marray= creararray();
                System.out.println(minArray(Marray));
                break;
            case 'd':
                Marray= creararray();
                System.out.println(medarray(Marray));
                break;
            case 'e':
                Marray= creararray();
                System.out.println("Que numero quieres comprobar");
                int numero= in.nextInt();
                System.out.println(existenumarray(Marray, numero));
                break;
            case 'f':
                System.out.println("Primera array");
                Marrayvect1= creararray();
                System.out.println("Segunda array");
                Marrayvect2= creararray();
                if (Marrayvect1.length==Marrayvect2.length) {
                    int[] a = sumvectores(Marrayvect1, Marrayvect2);
                    System.out.println(Arrays.toString(a));
                }
                break;
            case 'g':
                System.out.println("Primera array");
                Marrayvect1= creararray();
                System.out.println("Segunda array");
                Marrayvect2= creararray();
                if (Marrayvect1.length==Marrayvect2.length) {
                    int[] b = restvectores(Marrayvect1, Marrayvect2);
                    System.out.println(Arrays.toString(b));
                }
                break;
            case 'h':
                System.out.println("Primera array");
                Marrayvect1= creararray();
                System.out.println("Segunda array");
                Marrayvect2= creararray();
                if (Marrayvect1.length==Marrayvect2.length) {
                    System.out.println(prodvectores(Marrayvect1, Marrayvect2));
                }
                break;
            case 'i':
                Marray= creararray();
                System.out.println(Arrays.toString(Marray));
                System.out.println(Arrays.toString(invertirarray(Marray)));
                break;
            case 'j':
                Marray= creararray();
                System.out.println(Arrays.toString(Marray));
                procedinvertarray(Marray);
                System.out.println(Arrays.toString(Marray));
                break;
            case 'k':
                Marray= creararray();
                System.out.println(capicua(Marray));
        }
    }
}
