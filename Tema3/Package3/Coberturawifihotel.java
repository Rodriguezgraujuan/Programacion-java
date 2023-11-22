package Package3;

import java.util.Arrays;
import java.util.Scanner;

public class Coberturawifihotel {

    public static boolean habitacioncheck(int habitacion){
        return habitacion >= 0 && habitacion <= 19;
    }

    public static int[] cobertura(int[] hotelhabitacion, int potencia, int habitacion){
        hotelhabitacion[habitacion]=potencia;
        int habitacion1=habitacion-1;
        int habitacion2=habitacion+1;
        potencia--;
        for (int i = 0; i<potencia; potencia--){
            if (habitacioncheck(habitacion1)) {
                hotelhabitacion[habitacion1] = potencia;
            }
            if (habitacioncheck(habitacion2)) {
                hotelhabitacion[habitacion2] = potencia;
            }
                habitacion1--;
                habitacion2++;
        }
        return hotelhabitacion;
    }
    public static void main(String[] args) {
        int[] hotelhabitacion = new int[20];
        Scanner in = new Scanner(System.in);
        System.out.println("Numero de habitación:");
        int habitacion = in.nextInt();
        habitacion--;
        System.out.println("Potencia del router:");
        int potencia = in.nextInt();
        System.out.println(Arrays.toString(cobertura(hotelhabitacion, potencia, habitacion)));
    }
}
