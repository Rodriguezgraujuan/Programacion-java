package Tema2;
import java.util.Arrays;
import java.util.Scanner;

public class comprob {

    static int[][] hotel = new int[12][5];
    static Scanner in = new Scanner(System.in);

    public static void printcuadradomatriz() {
        for (int[] ints : hotel) {
            System.out.println(Arrays.toString(ints));
        }
    }


    public static int[][] coberturahabitacion(int piso, int habitacion, int potencia) {
        hotel[piso][habitacion] = potencia;

        for (int i = 1; i <= potencia; i++) {
            expandirCobertura(piso, habitacion + i, potencia - i);
            expandirCobertura(piso, habitacion - i, potencia - i);
            expandirCobertura(piso + i, habitacion, potencia - i);
            expandirCobertura(piso - i, habitacion, potencia - i);
            if (i==1) {
                expandirCobertura(piso + i, habitacion + i, potencia - 2 * i);
                expandirCobertura(piso - i, habitacion - i, potencia - 2 * i);
                expandirCobertura(piso + i, habitacion - i, potencia - 2 * i);
                expandirCobertura(piso - i, habitacion + i, potencia - 2 * i);
                expandirCobertura(piso + i*2, habitacion + i, potencia - 2 * i-2);
                expandirCobertura(piso - i*2, habitacion - i, potencia - 2 * i-2);
                expandirCobertura(piso + i*2, habitacion - i, potencia - 2 * i-2);
                expandirCobertura(piso - i*2, habitacion + i, potencia - 2 * i-2);
                expandirCobertura(piso - i, habitacion + i*2, potencia - 2 * i-2);
                expandirCobertura(piso + i, habitacion + i*2, potencia - 2 * i-2);
                expandirCobertura(piso - i, habitacion - i*2, potencia - 2 * i-2);
                expandirCobertura(piso + i, habitacion - i*2, potencia - 2 * i-2);
            }
        }

        return hotel;
    }

    public static void expandirCobertura(int piso, int habitacion, int potencia) {
        if (piso >= 0 && piso < 12 && habitacion >= 0 && habitacion < 5 && potencia > 0) {
            hotel[piso][habitacion] = Math.max(hotel[piso][habitacion], potencia);
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce el piso");
        int piso = in.nextInt();
        System.out.println("Introduce la habitación");
        int habitacion = in.nextInt();
        System.out.println("Introduce la potencia");
        int potencia = in.nextInt();
        coberturahabitacion(piso, habitacion, potencia);
        printcuadradomatriz();
    }
}