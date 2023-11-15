package Package3;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    static Scanner in = new Scanner(System.in);


    public static void printarray(int [] Marray){
        for (int j : Marray) {
            System.out.println(j);
        }
    }

    public static int maxarray(int [] Marray){
        int max = 0;
        for (int j : Marray) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    public static int minarray(int [] Marray){
        int min = maxarray(Marray);
        for (int j : Marray) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }

    public static int medarray(int[] Marray){
        int media = 0;
        for (int j =0; j< Marray.length; j++) {
            media += Marray[j];
        }
        media /= Marray.length;
        return media;
    }

    public static boolean existenumarray(int[] Marray , int numero){
        boolean existe = false;
        for (int j =0 ; j< Marray.length;j++) {
            if (numero == Marray[j]){
                existe=true;
            }
        }
        return existe;
    }

    public static int[] sumvectores(int[] Marrayvect1, int[] Marrayvect2){
        int[] a = {0,0,0,0};
        int numvect1 = 0;
        int numvect2 = 0;
        for (int j = 0; j< Marrayvect1.length || j<Marrayvect2.length;j++){
            numvect1 = Marrayvect1[j];
            numvect2 = Marrayvect2[j];
            a[j] = numvect1+numvect2;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] Marray = new int[]{1,2,3,7,4};
        int[] Marrayvect1 = new int[]{9,18,27,7};
        int[] Marrayvect2 = new int[]{19,778,457,25};
        printarray(Marray);
        System.out.println("Siguiente");
        System.out.println(maxarray(Marray));
        System.out.println(minarray(Marray));
        System.out.println(medarray(Marray));
        System.out.println("Que numero quieres comprobar");
        int numero = in.nextInt();
        System.out.println(existenumarray(Marray, numero));
        System.out.println(Arrays.toString(sumvectores(Marrayvect1, Marrayvect2)));
    }
}
