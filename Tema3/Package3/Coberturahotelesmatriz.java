package Package3;

import java.util.Arrays;
import java.util.Scanner;

public class Coberturahotelesmatriz {
    static int[][] hotel=new int[8][8];
    static Scanner in = new Scanner(System.in);
    public static void printcuadradomatriz() {
        for (int[] ints : hotel) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static int[][] coberturahabitacion(int piso, int habitacion, int potencia){
        hotel[piso][habitacion]=potencia;
        int piso1=piso;
        int piso2=piso;

        int potencia1=potencia;
        int potencia2=potencia;

        for (int i = 0;i<hotel.length;i++){
            piso1--;
            if (piso1>=0){
                 potencia1--;
                 hotel[piso1][habitacion]=potencia1;
             }
        }
        for (int i = 0;i<hotel.length;i++){
            piso2++;
            if (piso2<8){
                potencia2--;
                hotel[piso2][habitacion]=potencia2;
            }
        }


        return hotel;
    }

    public static void main(String[] args) {
        System.out.println("Introduce el piso");
        int piso= in.nextInt();
        System.out.println("Introduce la habitación");
        int habitacion = in.nextInt();
        System.out.println("Introduce la potencia");
        int potencia = in.nextInt();
        coberturahabitacion(piso,habitacion,potencia);
        printcuadradomatriz();
    }
}
